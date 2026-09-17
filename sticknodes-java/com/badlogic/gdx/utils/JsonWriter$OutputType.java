package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public enum JsonWriter$OutputType extends java.lang.Enum<com.badlogic.gdx.utils.JsonWriter$OutputType> {
    private static final /* synthetic */ com.badlogic.gdx.utils.JsonWriter$OutputType[] $VALUES = null;
    public static final com.badlogic.gdx.utils.JsonWriter$OutputType javascript = null;
    private static java.util.regex.Pattern javascriptPattern;
    public static final com.badlogic.gdx.utils.JsonWriter$OutputType json = null;
    public static final com.badlogic.gdx.utils.JsonWriter$OutputType minimal = null;
    private static java.util.regex.Pattern minimalNamePattern;
    private static java.util.regex.Pattern minimalValuePattern;

    static {
            com.badlogic.gdx.utils.JsonWriter$OutputType r0 = new com.badlogic.gdx.utils.JsonWriter$OutputType
            java.lang.String r1 = "json"
            r2 = 0
            r0.<init>(r1, r2)
            com.badlogic.gdx.utils.JsonWriter$OutputType.json = r0
            com.badlogic.gdx.utils.JsonWriter$OutputType r1 = new com.badlogic.gdx.utils.JsonWriter$OutputType
            java.lang.String r3 = "javascript"
            r4 = 1
            r1.<init>(r3, r4)
            com.badlogic.gdx.utils.JsonWriter$OutputType.javascript = r1
            com.badlogic.gdx.utils.JsonWriter$OutputType r3 = new com.badlogic.gdx.utils.JsonWriter$OutputType
            java.lang.String r5 = "minimal"
            r6 = 2
            r3.<init>(r5, r6)
            com.badlogic.gdx.utils.JsonWriter$OutputType.minimal = r3
            r5 = 3
            com.badlogic.gdx.utils.JsonWriter$OutputType[] r5 = new com.badlogic.gdx.utils.JsonWriter$OutputType[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.badlogic.gdx.utils.JsonWriter$OutputType.$VALUES = r5
            java.lang.String r0 = "^[a-zA-Z_$][a-zA-Z_$0-9]*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.badlogic.gdx.utils.JsonWriter$OutputType.javascriptPattern = r0
            java.lang.String r0 = "^[^\":,}/ ][^:]*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.badlogic.gdx.utils.JsonWriter$OutputType.minimalNamePattern = r0
            java.lang.String r0 = "^[^\":,{\\[\\]/ ][^}\\],]*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.badlogic.gdx.utils.JsonWriter$OutputType.minimalValuePattern = r0
            return
    }

    JsonWriter$OutputType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.badlogic.gdx.utils.JsonWriter$OutputType valueOf(java.lang.String r1) {
            java.lang.Class<com.badlogic.gdx.utils.JsonWriter$OutputType> r0 = com.badlogic.gdx.utils.JsonWriter$OutputType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.badlogic.gdx.utils.JsonWriter$OutputType r1 = (com.badlogic.gdx.utils.JsonWriter$OutputType) r1
            return r1
    }

    public static com.badlogic.gdx.utils.JsonWriter$OutputType[] values() {
            com.badlogic.gdx.utils.JsonWriter$OutputType[] r0 = com.badlogic.gdx.utils.JsonWriter$OutputType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.badlogic.gdx.utils.JsonWriter$OutputType[] r0 = (com.badlogic.gdx.utils.JsonWriter$OutputType[]) r0
            return r0
    }

    public java.lang.String quoteName(java.lang.String r5) {
            r4 = this;
            com.badlogic.gdx.utils.StringBuilder r0 = new com.badlogic.gdx.utils.StringBuilder
            r0.<init>(r5)
            r1 = 92
            java.lang.String r2 = "\\\\"
            com.badlogic.gdx.utils.StringBuilder r1 = r0.replace(r1, r2)
            r2 = 13
            java.lang.String r3 = "\\r"
            com.badlogic.gdx.utils.StringBuilder r1 = r1.replace(r2, r3)
            r2 = 10
            java.lang.String r3 = "\\n"
            com.badlogic.gdx.utils.StringBuilder r1 = r1.replace(r2, r3)
            r2 = 9
            java.lang.String r3 = "\\t"
            r1.replace(r2, r3)
            int[] r1 = com.badlogic.gdx.utils.JsonWriter$1.$SwitchMap$com$badlogic$gdx$utils$JsonWriter$OutputType
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L33
            r5 = 2
            if (r1 == r5) goto L54
            goto L65
        L33:
            java.lang.String r1 = "//"
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L54
            java.lang.String r1 = "/*"
            boolean r5 = r5.contains(r1)
            if (r5 != 0) goto L54
            java.util.regex.Pattern r5 = com.badlogic.gdx.utils.JsonWriter$OutputType.minimalNamePattern
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L54
            java.lang.String r5 = r0.toString()
            return r5
        L54:
            java.util.regex.Pattern r5 = com.badlogic.gdx.utils.JsonWriter$OutputType.javascriptPattern
            java.util.regex.Matcher r5 = r5.matcher(r0)
            boolean r5 = r5.matches()
            if (r5 == 0) goto L65
            java.lang.String r5 = r0.toString()
            return r5
        L65:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r1 = 34
            r5.append(r1)
            java.lang.String r2 = "\\\""
            com.badlogic.gdx.utils.StringBuilder r0 = r0.replace(r1, r2)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            return r5
    }

    public java.lang.String quoteValue(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = "null"
            if (r6 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = r6.toString()
            boolean r2 = r6 instanceof java.lang.Number
            if (r2 != 0) goto La1
            boolean r6 = r6 instanceof java.lang.Boolean
            if (r6 == 0) goto L13
            goto La1
        L13:
            com.badlogic.gdx.utils.StringBuilder r6 = new com.badlogic.gdx.utils.StringBuilder
            r6.<init>(r1)
            r2 = 92
            java.lang.String r3 = "\\\\"
            com.badlogic.gdx.utils.StringBuilder r2 = r6.replace(r2, r3)
            r3 = 13
            java.lang.String r4 = "\\r"
            com.badlogic.gdx.utils.StringBuilder r2 = r2.replace(r3, r4)
            r3 = 10
            java.lang.String r4 = "\\n"
            com.badlogic.gdx.utils.StringBuilder r2 = r2.replace(r3, r4)
            r3 = 9
            java.lang.String r4 = "\\t"
            r2.replace(r3, r4)
            com.badlogic.gdx.utils.JsonWriter$OutputType r2 = com.badlogic.gdx.utils.JsonWriter$OutputType.minimal
            if (r5 != r2) goto L82
            java.lang.String r2 = "true"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L82
            java.lang.String r2 = "false"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L82
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "//"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L82
            java.lang.String r0 = "/*"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L82
            int r0 = r6.length()
            if (r0 <= 0) goto L82
            int r0 = r0 + (-1)
            char r0 = r6.charAt(r0)
            r1 = 32
            if (r0 == r1) goto L82
            java.util.regex.Pattern r0 = com.badlogic.gdx.utils.JsonWriter$OutputType.minimalValuePattern
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L82
            java.lang.String r6 = r6.toString()
            return r6
        L82:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 34
            r0.append(r1)
            java.lang.String r2 = "\\\""
            com.badlogic.gdx.utils.StringBuilder r6 = r6.replace(r1, r2)
            java.lang.String r6 = r6.toString()
            r0.append(r6)
            r0.append(r1)
            java.lang.String r6 = r0.toString()
            return r6
        La1:
            return r1
    }
}
