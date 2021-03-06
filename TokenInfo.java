// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

/**
 * An enum of token kinds. Each entry in this enum represents the kind of a
 * token along with its image (string representation).
 * 
 * When you add a new token to the scanner, you must also add an entry to this
 * enum specifying the kind and image of the new token.
 */

enum TokenKind {
    EOF("<EOF>"), ABSTRACT("abstract"), /* added */ ASSERT("assert"), BOOLEAN("boolean"), 
    /* added */ BREAK("break"), /* added */ BYTE("byte"), /* added */ CASE("case"), CHAR("char"), CLASS(
    "class"), /* added */ CONST("const"), /* added */ CONTINUE("continue"), 
    /* added */ DEFAULT("default"),  /* added */ DOUBLE("double"), /* added */ DO("do"), ELSE("else"), 
    /* added */ ENUM("enum"), 
    EXTENDS("extends"), FALSE("false"), /* added */ FINAL("final"), /* added */ FINALLY("finally"), 
    /* added */ FLOAT("float"), /* added */ FOR("for"), /* added */ GOTO("goto"), IF("if"), 
    /* added */ IMPLEMENTS("implements"), IMPORT("import"), INSTANCEOF("instanceof"), INT("int"), 
    /* added */ INTERFACE("interface"), /* added */ LONG("long"), /* added */ MINUS_ASSIGN("-="), /* added */ MULT_ASSIGN("*="), /* added */ NATIVE("native"), 
    NEW("new"), NULL("null"), PACKAGE("package"), PRIVATE("private"), PROTECTED("protected"), 
    PUBLIC("public"), RETURN("return"), /* added */ SHORT("short"), /* added */ SLS_ASSIGN("<<="), STATIC("static"), 
    /* added */ STRICTFP("strictfp"), SUPER("super"), /* added */ SWITCH("switch"), 
    /* added */ SYNCHRONIZED("synchronized"), THIS("this"), /* added */ THROW("throw"), 
    /* added */THROWS("throws"), /* added */ TRANSIENT("transient"), TRUE("true"), 
    /* added */ TRY("try"), VOID("void"), /* added */ VOLATILE("volatile"), WHILE("while"), PLUS(
    "+"), ASSIGN("="), DEC("--"), EQUAL("=="), /* added */ GE(">="), GT(">"), INC("++"), LAND(
    "&&"), LE("<="), LNOT("!"), /* added */ LT("<"), MINUS("-"), PLUS_ASSIGN("+="), STAR("*"), LPAREN(
    "("), RPAREN(")"), LCURLY("{"), RCURLY("}"), LBRACK("["), RBRACK(
    "]"), SEMI(";"), COMMA(","), DOT("."), IDENTIFIER("<IDENTIFIER>"), 
    /* added */ DOUBLE_LITERAL("<DOUBLE_LITERAL>"), INT_LITERAL(
    "<INT_LITERAL>"), /* added */ FLOAT_LITERAL("<FLOAT_LITERAL>"), /* added */ LONG_LITERAL("<LONG_LITERAL>"), CHAR_LITERAL("<CHAR_LITERAL>"), STRING_LITERAL(
    "<STRING_LITERAL>"), /* added */ OCTAL_LITERAL("<OCTAL_LITERAL>"), /* added */ HEX_LITERAL("<HEX_LITERAL>"),
    /** all after here were added **/ TILDE("~"), MOD("%"), MOD_ASSIGN("%="), BIT_EX_OR_ASSIGN("^="), URS_ASSIGN(">>>="), SRS_ASSIGN(">>="),
    SIGNED_LEFT_SHIFT("<<"), SIGNED_RIGHT_SHIFT(">>"), 
    UNSIGNED_RIGHT_SHIFT(">>>"), DIV("/"), NOT_EQ("!="), BIT_AND("&"), 
    BIT_EX_OR("^"), BIT_IN_OR("|"), LOGICAL_OR("||"), /* added */ BIT_IN_OR_ASSIGN("|="), DIV_ASSIGN("/="), BIT_AND_ASSIGN("&="), 
    QUEST_TERNARY("?"), SOL_TERNARY(":"), CATCH("catch");

    /** The token's string representation. */
    private String image;

    /**
     * Construct an instance TokenKind given its string representation.
     * 
     * @param image
     *            string representation of the token.
     */

    private TokenKind(String image) {
        this.image = image;
    }

    /**
     * Return the image of the token.
     * 
     * @return the token's image.
     */

    public String image() {
        return image;
    }

    /**
     * Return the string representation of the token.
     * 
     * @return the token's string representation.
     */

    public String toString() {
        return image;
    }

}

/**
 * A representation of tokens returned by the lexical analyzer method,
 * getNextToken(). A token has a kind identifying what kind of token it is, an
 * image for providing any semantic text, and the line in which it occurred in
 * the source file.
 */

class TokenInfo {

    /** Token kind. */
    private TokenKind kind;

    /**
     * Semantic text (if any). For example, the identifier name when the token
     * kind is IDENTIFIER. For tokens without a semantic text, it is simply its
     * string representation. For example, "+=" when the token kind is
     * PLUS_ASSIGN.
     */
    private String image;

    /** Line in which the token occurs in the source file. */
    private int line;

    /**
     * Construct a TokenInfo from its kind, the semantic text forming the token,
     * and its line number.
     * 
     * @param kind
     *            the token's kind.
     * @param image
     *            the semantic text comprising the token.
     * @param line
     *            the line in which the token occurs in the source file.
     */

    public TokenInfo(TokenKind kind, String image, int line) {
        this.kind = kind;
        this.image = image;
        this.line = line;
    }

    /**
     * Construct a TokenInfo from its kind, and its line number. Its image is
     * simply its string representation.
     * 
     * @param kind
     *            the token's identifying number.
     * @param line
     *            identifying the line on which the token was found.
     */

    public TokenInfo(TokenKind kind, int line) {
        this(kind, kind.toString(), line);
    }

    /**
     * Return the token's string representation.
     * 
     * @return the string representation.
     */

    public String tokenRep() {
        return kind.toString();
    }

    /**
     * Return the semantic text associated with the token.
     * 
     * @return the semantic text.
     */

    public String image() {
        return image;
    }

    /**
     * Return the line number associated with the token.
     * 
     * @return the line number.
     */

    public int line() {
        return line;
    }

    /**
     * Return the token's kind.
     * 
     * @return the kind.
     */

    public TokenKind kind() {
        return kind;
    }

    /**
     * Return the token's image.
     * 
     * @return the image.
     */

    public String toString() {
        return image;
    }

}
