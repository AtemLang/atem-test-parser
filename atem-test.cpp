#include <print>
#include <string>
#include <antlr4-runtime.h>
#include <chrono>
#include "grammar/AtemLexer.h"
#include "grammar/AtemParser.h"

#pragma execution_character_set("utf-8")

using namespace std;
using namespace antlr4;

int main(int argc, const char* argv[])
{
	ANTLRInputStream input_stream;
	if(argc <= 1) {
		println("==============================");
		println("Test Lexer and Parser for Atem");
		println("==============================");
		string input, line;
		println("Enter Atem code here:");
		while (true) {
			getline(cin, line);
			if (line == "exit") break;
			input.append(line).append("\n");
		}
		input_stream.load(input);
	}
	else
	{
		println("==============================");
		println("Test Lexer and Parser for Atem");
		println("==============================");

		ifstream ifs;
		ifs.open(argv[1]);
		input_stream.load(ifs);
	}

	
	AtemLexer lexer(&input_stream);
	CommonTokenStream tokens(&lexer);

	AtemParser parser(&tokens);
	println("Parsing code...");
	const auto start = chrono::steady_clock::now();
	tree::ParseTree* tree = parser.program();
	const auto end = chrono::steady_clock::now();
	const auto duration = end - start;

	println("==============================");
	println(
		"Benchmark Result:\n Nanoseconds: {}\n Microseconds: {}\n Milliseconds: {}\n Seconds: {}\n Minutes: {}\n Hours: {}",
		chrono::duration_cast<chrono::nanoseconds>(duration),
		chrono::duration_cast<chrono::microseconds>(duration),
		chrono::duration_cast<chrono::milliseconds>(duration),
		chrono::duration_cast<chrono::seconds>(duration),
		chrono::duration_cast<chrono::minutes>(duration),
		chrono::duration_cast<chrono::hours>(duration)
		);
	println("==============================");
	println("");

	auto s = tree->toStringTree(&parser);
	println("==============================");
	println("Parse Tree:\n {}", s);
	println("==============================");
}
