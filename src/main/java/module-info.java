module thisIsJava.module.a {
	exports package1;
	exports package2;

	requires transitive thisIsJava.module.b;
}