package gen;// Generated from /home/luis/Descargas/Diunisio/src/Diunisio.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DiunisioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DiunisioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(DiunisioParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(DiunisioParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#dependencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencia(DiunisioParser.DependenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#declaracionTipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionTipo(DiunisioParser.DeclaracionTipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#declaracionClaseOInterfaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionClaseOInterfaz(DiunisioParser.DeclaracionClaseOInterfazContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#modificadoresDeClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificadoresDeClase(DiunisioParser.ModificadoresDeClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#modificadorClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificadorClase(DiunisioParser.ModificadorClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#modificadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificadores(DiunisioParser.ModificadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#declaracionClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionClase(DiunisioParser.DeclaracionClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#normaldeclaracionClase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormaldeclaracionClase(DiunisioParser.NormaldeclaracionClaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(DiunisioParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(DiunisioParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(DiunisioParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(DiunisioParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#declaracionInterfaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionInterfaz(DiunisioParser.DeclaracionInterfazContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#normaldeclaracionInterfaz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormaldeclaracionInterfaz(DiunisioParser.NormaldeclaracionInterfazContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(DiunisioParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(DiunisioParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(DiunisioParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(DiunisioParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(DiunisioParser.MemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(DiunisioParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#genericMethodOrConstructorDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodOrConstructorDecl(DiunisioParser.GenericMethodOrConstructorDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#genericMethodOrConstructorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodOrConstructorRest(DiunisioParser.GenericMethodOrConstructorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(DiunisioParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(DiunisioParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(DiunisioParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#interfaceMemberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDecl(DiunisioParser.InterfaceMemberDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#interfaceMethodOrFieldDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodOrFieldDecl(DiunisioParser.InterfaceMethodOrFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#interfaceMethodOrFieldRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodOrFieldRest(DiunisioParser.InterfaceMethodOrFieldRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#methodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaratorRest(DiunisioParser.MethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#voidMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidMethodDeclaratorRest(DiunisioParser.VoidMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#interfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaratorRest(DiunisioParser.InterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#interfaceGenericMethodDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceGenericMethodDecl(DiunisioParser.InterfaceGenericMethodDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#voidInterfaceMethodDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidInterfaceMethodDeclaratorRest(DiunisioParser.VoidInterfaceMethodDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#constructorDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaratorRest(DiunisioParser.ConstructorDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(DiunisioParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(DiunisioParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(DiunisioParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#constantDeclaratorsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorsRest(DiunisioParser.ConstantDeclaratorsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#constantDeclaratorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclaratorRest(DiunisioParser.ConstantDeclaratorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(DiunisioParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(DiunisioParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(DiunisioParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(DiunisioParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#modificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificador(DiunisioParser.ModificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(DiunisioParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#formalParameterDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDecls(DiunisioParser.FormalParameterDeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variableModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifiers(DiunisioParser.VariableModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(DiunisioParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#formalParameterDeclsRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterDeclsRest(DiunisioParser.FormalParameterDeclsRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(DiunisioParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(DiunisioParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(DiunisioParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(DiunisioParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(DiunisioParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#classOrInterfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceDeclaration(DiunisioParser.ClassOrInterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#classOrInterfaceModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifiers(DiunisioParser.ClassOrInterfaceModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(DiunisioParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(DiunisioParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(DiunisioParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(DiunisioParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(DiunisioParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#annotations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotations(DiunisioParser.AnnotationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(DiunisioParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(DiunisioParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(DiunisioParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(DiunisioParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(DiunisioParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(DiunisioParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionNotPlusMinus(DiunisioParser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#algoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgoritmo(DiunisioParser.AlgoritmoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#lista_ids}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_ids(DiunisioParser.Lista_idsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#exp_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_simple(DiunisioParser.Exp_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(DiunisioParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#expresionCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionCondicional(DiunisioParser.ExpresionCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DiunisioParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(DiunisioParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DiunisioParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(DiunisioParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DiunisioParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#lista_parsv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parsv(DiunisioParser.Lista_parsvContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#conjunto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunto(DiunisioParser.ConjuntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(DiunisioParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DiunisioParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(DiunisioParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(DiunisioParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#sec_proposiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSec_proposiciones(DiunisioParser.Sec_proposicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#proposicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProposicion(DiunisioParser.ProposicionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigNum}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigNum(DiunisioParser.AsigNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigVec}
	 * labeled alternative in {@link DiunisioParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigVec(DiunisioParser.AsigVecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#si_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi_senten(DiunisioParser.Si_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#bloque_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_condicional(DiunisioParser.Bloque_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#mientras_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras_senten(DiunisioParser.Mientras_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#hacer_mientras_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHacer_mientras_senten(DiunisioParser.Hacer_mientras_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#seleccionar_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeleccionar_senten(DiunisioParser.Seleccionar_sentenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casosGen}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosGen(DiunisioParser.CasosGenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code casosDef}
	 * labeled alternative in {@link DiunisioParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasosDef(DiunisioParser.CasosDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#para_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPara_senten(DiunisioParser.Para_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#fun_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_senten(DiunisioParser.Fun_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#proc_senten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_senten(DiunisioParser.Proc_sentenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(DiunisioParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DiunisioParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(DiunisioParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DiunisioParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(DiunisioParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(DiunisioParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(DiunisioParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(DiunisioParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(DiunisioParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(DiunisioParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(DiunisioParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(DiunisioParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(DiunisioParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(DiunisioParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(DiunisioParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(DiunisioParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(DiunisioParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(DiunisioParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#identifierSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSuffix(DiunisioParser.IdentifierSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(DiunisioParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DiunisioParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(DiunisioParser.ExpressionListContext ctx);
}