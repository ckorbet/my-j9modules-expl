module com.cartorgon {
	/*
	 * Not really required since all the modules are going to need base types.
	 * It's included/required just for demo purposes
	 */
	requires java.base;
	requires java.logging;
	
	/*
	 * Only the exported packages themselves are available for other modules, NOT THE SUB-PKGs. 
	 * If sub-pkgs are required to be exported, they must be explicitly exported.
	 */
	exports com.cartorgon;
}