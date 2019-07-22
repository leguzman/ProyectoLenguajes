package gen;// Generated from /home/luis/Descargas/Diunisio/src/Diunisio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiunisioParser}.
 */
public interface DiunisioListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(DiunisioParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(DiunisioParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(DiunisioParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(DiunisioParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#dependencia}.
	 * @param ctx the parse tree
	 */
	void enterDependencia(DiunisioParser.DependenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#dependencia}.
	 * @param ctx the parse tree
	 */
	void exitDependencia(DiunisioParser.DependenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#declaracionTipo}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionTipo(DiunisioParser.DeclaracionTipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#declaracionTipo}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionTipo(DiunisioParser.DeclaracionTipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#declaracionClaseOInterfaz}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionClaseOInterfaz(DiunisioParser.DeclaracionClaseOInterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#declaracionClaseOInterfaz}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionClaseOInterfaz(DiunisioParser.DeclaracionClaseOInterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#modificadoresDeClase}.
	 * @param ctx the parse tree
	 */
	void enterModificadoresDeClase(DiunisioParser.ModificadoresDeClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#modificadoresDeClase}.
	 * @param ctx the parse tree
	 */
	void exitModificadoresDeClase(DiunisioParser.ModificadoresDeClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#modificadorClase}.
	 * @param ctx the parse tree
	 */
	void enterModificadorClase(DiunisioParser.ModificadorClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#modificadorClase}.
	 * @param ctx the parse tree
	 */
	void exitModificadorClase(DiunisioParser.ModificadorClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#modificadores}.
	 * @param ctx the parse tree
	 */
	void enterModificadores(DiunisioParser.ModificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#modificadores}.
	 * @param ctx the parse tree
	 */
	void exitModificadores(DiunisioParser.ModificadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#declaracionClase}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionClase(DiunisioParser.DeclaracionClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#declaracionClase}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionClase(DiunisioParser.DeclaracionClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#normaldeclaracionClase}.
	 * @param ctx the parse tree
	 */
	void enterNormaldeclaracionClase(DiunisioParser.NormaldeclaracionClaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#normaldeclaracionClase}.
	 * @param ctx the parse tree
	 */
	void exitNormaldeclaracionClase(DiunisioParser.NormaldeclaracionClaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(DiunisioParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(DiunisioParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(DiunisioParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(DiunisioParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(DiunisioParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(DiunisioParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(DiunisioParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(DiunisioParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#declaracionInterfaz}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionInterfaz(DiunisioParser.DeclaracionInterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#declaracionInterfaz}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionInterfaz(DiunisioParser.DeclaracionInterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#normaldeclaracionInterfaz}.
	 * @param ctx the parse tree
	 */
	void enterNormaldeclaracionInterfaz(DiunisioParser.NormaldeclaracionInterfazContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#normaldeclaracionInterfaz}.
	 * @param ctx the parse tree
	 */
	void exitNormaldeclaracionInterfaz(DiunisioParser.NormaldeclaracionInterfazContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(DiunisioParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(DiunisioParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(DiunisioParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(DiunisioParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(DiunisioParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(DiunisioParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(DiunisioParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(DiunisioParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterMemberDecl(DiunisioParser.MemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitMemberDecl(DiunisioParser.MemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(DiunisioParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(DiunisioParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodOrConstructorDecl(DiunisioParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodOrConstructorDecl(DiunisioParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodOrConstructorRest(DiunisioParser.GenericMethodOrConstructorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodOrConstructorRest(DiunisioParser.GenericMethodOrConstructorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(DiunisioParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(DiunisioParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(DiunisioParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(DiunisioParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(DiunisioParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(DiunisioParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDecl(DiunisioParser.InterfaceMemberDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDecl(DiunisioParser.InterfaceMemberDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldDecl(DiunisioParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldDecl(DiunisioParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodOrFieldRest(DiunisioParser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodOrFieldRest(DiunisioParser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaratorRest(DiunisioParser.MethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaratorRest(DiunisioParser.MethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidMethodDeclaratorRest(DiunisioParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidMethodDeclaratorRest(DiunisioParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaratorRest(DiunisioParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaratorRest(DiunisioParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceGenericMethodDecl(DiunisioParser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceGenericMethodDecl(DiunisioParser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterVoidInterfaceMethodDeclaratorRest(DiunisioParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitVoidInterfaceMethodDeclaratorRest(DiunisioParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaratorRest(DiunisioParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaratorRest(DiunisioParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(DiunisioParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(DiunisioParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(DiunisioParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(DiunisioParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(DiunisioParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(DiunisioParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorsRest(DiunisioParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorsRest(DiunisioParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaratorRest(DiunisioParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaratorRest(DiunisioParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(DiunisioParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(DiunisioParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(DiunisioParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(DiunisioParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(DiunisioParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(DiunisioParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(DiunisioParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(DiunisioParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#modificador}.
	 * @param ctx the parse tree
	 */
	void enterModificador(DiunisioParser.ModificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#modificador}.
	 * @param ctx the parse tree
	 */
	void exitModificador(DiunisioParser.ModificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(DiunisioParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(DiunisioParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDecls(DiunisioParser.FormalParameterDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDecls(DiunisioParser.FormalParameterDeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifiers(DiunisioParser.VariableModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variableModifiers}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifiers(DiunisioParser.VariableModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(DiunisioParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(DiunisioParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterDeclsRest(DiunisioParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterDeclsRest(DiunisioParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(DiunisioParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(DiunisioParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(DiunisioParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(DiunisioParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(DiunisioParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(DiunisioParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(DiunisioParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(DiunisioParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(DiunisioParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(DiunisioParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceDeclaration(DiunisioParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceDeclaration(DiunisioParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifiers(DiunisioParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifiers(DiunisioParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(DiunisioParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(DiunisioParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(DiunisioParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(DiunisioParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(DiunisioParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(DiunisioParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DiunisioParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DiunisioParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(DiunisioParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(DiunisioParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#annotations}.
	 * @param ctx the parse tree
	 */
	void enterAnnotations(DiunisioParser.AnnotationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#annotations}.
	 * @param ctx the parse tree
	 */
	void exitAnnotations(DiunisioParser.AnnotationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(DiunisioParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(DiunisioParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationName(DiunisioParser.AnnotationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#annotationName}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationName(DiunisioParser.AnnotationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(DiunisioParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(DiunisioParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(DiunisioParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(DiunisioParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(DiunisioParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(DiunisioParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(DiunisioParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(DiunisioParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(DiunisioParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(DiunisioParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(DiunisioParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(DiunisioParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#lista_ids}.
	 * @param ctx the parse tree
	 */
	void enterLista_ids(DiunisioParser.Lista_idsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#lista_ids}.
	 * @param ctx the parse tree
	 */
	void exitLista_ids(DiunisioParser.Lista_idsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#exp_simple}.
	 * @param ctx the parse tree
	 */
	void enterExp_simple(DiunisioParser.Exp_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#exp_simple}.
	 * @param ctx the parse tree
	 */
	void exitExp_simple(DiunisioParser.Exp_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(DiunisioParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(DiunisioParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#expresionCondicional}.
	 * @param ctx the parse tree
	 */
	void enterExpresionCondicional(DiunisioParser.ExpresionCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#expresionCondicional}.
	 * @param ctx the parse tree
	 */
	void exitExpresionCondicional(DiunisioParser.ExpresionCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(DiunisioParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(DiunisioParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(DiunisioParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(DiunisioParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DiunisioParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DiunisioParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(DiunisioParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(DiunisioParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DiunisioParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DiunisioParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#lista_parsv}.
	 * @param ctx the parse tree
	 */
	void enterLista_parsv(DiunisioParser.Lista_parsvContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#lista_parsv}.
	 * @param ctx the parse tree
	 */
	void exitLista_parsv(DiunisioParser.Lista_parsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterConjunto(DiunisioParser.ConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitConjunto(DiunisioParser.ConjuntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(DiunisioParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(DiunisioParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DiunisioParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DiunisioParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(DiunisioParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(DiunisioParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(DiunisioParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(DiunisioParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#sec_proposiciones}.
	 * @param ctx the parse tree
	 */
	void enterSec_proposiciones(DiunisioParser.Sec_proposicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#sec_proposiciones}.
	 * @param ctx the parse tree
	 */
	void exitSec_proposiciones(DiunisioParser.Sec_proposicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void enterProposicion(DiunisioParser.ProposicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#proposicion}.
	 * @param ctx the parse tree
	 */
	void exitProposicion(DiunisioParser.ProposicionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsigNum(DiunisioParser.AsigNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsigNum(DiunisioParser.AsigNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsigVec(DiunisioParser.AsigVecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsigVec(DiunisioParser.AsigVecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#si_senten}.
	 * @param ctx the parse tree
	 */
	void enterSi_senten(DiunisioParser.Si_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#si_senten}.
	 * @param ctx the parse tree
	 */
	void exitSi_senten(DiunisioParser.Si_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#bloque_condicional}.
	 * @param ctx the parse tree
	 */
	void enterBloque_condicional(DiunisioParser.Bloque_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#bloque_condicional}.
	 * @param ctx the parse tree
	 */
	void exitBloque_condicional(DiunisioParser.Bloque_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#mientras_senten}.
	 * @param ctx the parse tree
	 */
	void enterMientras_senten(DiunisioParser.Mientras_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#mientras_senten}.
	 * @param ctx the parse tree
	 */
	void exitMientras_senten(DiunisioParser.Mientras_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#hacer_mientras_senten}.
	 * @param ctx the parse tree
	 */
	void enterHacer_mientras_senten(DiunisioParser.Hacer_mientras_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#hacer_mientras_senten}.
	 * @param ctx the parse tree
	 */
	void exitHacer_mientras_senten(DiunisioParser.Hacer_mientras_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 */
	void enterSeleccionar_senten(DiunisioParser.Seleccionar_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 */
	void exitSeleccionar_senten(DiunisioParser.Seleccionar_sentenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasosGen(DiunisioParser.CasosGenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasosGen(DiunisioParser.CasosGenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void enterCasosDef(DiunisioParser.CasosDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 */
	void exitCasosDef(DiunisioParser.CasosDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#para_senten}.
	 * @param ctx the parse tree
	 */
	void enterPara_senten(DiunisioParser.Para_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#para_senten}.
	 * @param ctx the parse tree
	 */
	void exitPara_senten(DiunisioParser.Para_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#fun_senten}.
	 * @param ctx the parse tree
	 */
	void enterFun_senten(DiunisioParser.Fun_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#fun_senten}.
	 * @param ctx the parse tree
	 */
	void exitFun_senten(DiunisioParser.Fun_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#proc_senten}.
	 * @param ctx the parse tree
	 */
	void enterProc_senten(DiunisioParser.Proc_sentenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#proc_senten}.
	 * @param ctx the parse tree
	 */
	void exitProc_senten(DiunisioParser.Proc_sentenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(DiunisioParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(DiunisioParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DiunisioParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DiunisioParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(DiunisioParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(DiunisioParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DiunisioParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DiunisioParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(DiunisioParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(DiunisioParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(DiunisioParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(DiunisioParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(DiunisioParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(DiunisioParser.InnerCreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(DiunisioParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(DiunisioParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(DiunisioParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(DiunisioParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(DiunisioParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(DiunisioParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(DiunisioParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(DiunisioParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(DiunisioParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(DiunisioParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(DiunisioParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(DiunisioParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(DiunisioParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(DiunisioParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(DiunisioParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(DiunisioParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(DiunisioParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(DiunisioParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(DiunisioParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(DiunisioParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(DiunisioParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(DiunisioParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSuffix(DiunisioParser.IdentifierSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#identifierSuffix}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSuffix(DiunisioParser.IdentifierSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(DiunisioParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(DiunisioParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiunisioParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(DiunisioParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiunisioParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(DiunisioParser.ExpressionListContext ctx);
}