module pacientClinical {
	// requires transitive paientManagment; // Importar otro proyecto
	// transitive => si otro proyecto que lo implemente tambien usa el externo, ese tambien lo puede usar
	
	requires static paientManagment; // Solo se usa durante la compilacion
}