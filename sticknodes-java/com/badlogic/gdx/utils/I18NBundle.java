package com.badlogic.gdx.utils;

/* loaded from: classes.dex */
public class I18NBundle {
    private static final java.util.Locale ROOT_LOCALE = null;
    private static boolean exceptionOnMissingKey;
    private static boolean simpleFormatter;
    private com.badlogic.gdx.utils.TextFormatter formatter;
    private java.util.Locale locale;
    private com.badlogic.gdx.utils.I18NBundle parent;
    private com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.String> properties;

    static {
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = ""
            r0.<init>(r1, r1, r1)
            com.badlogic.gdx.utils.I18NBundle.ROOT_LOCALE = r0
            r0 = 0
            com.badlogic.gdx.utils.I18NBundle.simpleFormatter = r0
            r0 = 1
            com.badlogic.gdx.utils.I18NBundle.exceptionOnMissingKey = r0
            return
    }

    public I18NBundle() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkFileExistence(com.badlogic.gdx.files.FileHandle r0) {
            java.io.InputStream r0 = r0.read()     // Catch: java.lang.Exception -> L9
            r0.close()     // Catch: java.lang.Exception -> L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static com.badlogic.gdx.utils.I18NBundle createBundle(com.badlogic.gdx.files.FileHandle r1, java.util.Locale r2) {
            java.lang.String r0 = "UTF-8"
            com.badlogic.gdx.utils.I18NBundle r1 = createBundleImpl(r1, r2, r0)
            return r1
    }

    public static com.badlogic.gdx.utils.I18NBundle createBundle(com.badlogic.gdx.files.FileHandle r0, java.util.Locale r1, java.lang.String r2) {
            com.badlogic.gdx.utils.I18NBundle r0 = createBundleImpl(r0, r1, r2)
            return r0
    }

    private static com.badlogic.gdx.utils.I18NBundle createBundleImpl(com.badlogic.gdx.files.FileHandle r9, java.util.Locale r10, java.lang.String r11) {
            r0 = 0
            if (r9 == 0) goto L83
            if (r10 == 0) goto L83
            if (r11 == 0) goto L83
            r1 = r10
        L8:
            java.util.List r2 = getCandidateLocales(r1)
            r3 = 0
            com.badlogic.gdx.utils.I18NBundle r4 = loadBundleChain(r9, r11, r2, r3, r0)
            if (r4 == 0) goto L3d
            java.util.Locale r5 = r4.getLocale()
            java.util.Locale r6 = com.badlogic.gdx.utils.I18NBundle.ROOT_LOCALE
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L43
            boolean r7 = r5.equals(r10)
            if (r7 == 0) goto L26
            goto L43
        L26:
            int r7 = r2.size()
            r8 = 1
            if (r7 != r8) goto L38
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L38
            goto L43
        L38:
            if (r6 == 0) goto L3d
            if (r0 != 0) goto L3d
            r0 = r4
        L3d:
            java.util.Locale r1 = getFallbackLocale(r1)
            if (r1 != 0) goto L8
        L43:
            if (r4 != 0) goto L82
            if (r0 == 0) goto L49
            r4 = r0
            goto L82
        L49:
            java.util.MissingResourceException r11 = new java.util.MissingResourceException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't find bundle for base file handle "
            r0.append(r1)
            java.lang.String r1 = r9.path()
            r0.append(r1)
            java.lang.String r1 = ", locale "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r9 = "_"
            r1.append(r9)
            r1.append(r10)
            java.lang.String r9 = r1.toString()
            java.lang.String r10 = ""
            r11.<init>(r0, r9, r10)
            throw r11
        L82:
            return r4
        L83:
            throw r0
    }

    private static java.util.List<java.util.Locale> getCandidateLocales(java.util.Locale r5) {
            java.lang.String r0 = r5.getLanguage()
            java.lang.String r1 = r5.getCountry()
            java.lang.String r2 = r5.getVariant()
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 4
            r3.<init>(r4)
            int r2 = r2.length()
            if (r2 <= 0) goto L1b
            r3.add(r5)
        L1b:
            int r2 = r1.length()
            if (r2 <= 0) goto L31
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L29
            r2 = r5
            goto L2e
        L29:
            java.util.Locale r2 = new java.util.Locale
            r2.<init>(r0, r1)
        L2e:
            r3.add(r2)
        L31:
            int r1 = r0.length()
            if (r1 <= 0) goto L46
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L3e
            goto L43
        L3e:
            java.util.Locale r5 = new java.util.Locale
            r5.<init>(r0)
        L43:
            r3.add(r5)
        L46:
            java.util.Locale r5 = com.badlogic.gdx.utils.I18NBundle.ROOT_LOCALE
            r3.add(r5)
            return r3
    }

    private static java.util.Locale getFallbackLocale(java.util.Locale r1) {
            java.util.Locale r0 = java.util.Locale.getDefault()
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto Lb
            r0 = 0
        Lb:
            return r0
    }

    private static com.badlogic.gdx.utils.I18NBundle loadBundle(com.badlogic.gdx.files.FileHandle r2, java.lang.String r3, java.util.Locale r4) {
            r0 = 0
            com.badlogic.gdx.files.FileHandle r2 = toFileHandle(r2, r4)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            boolean r1 = checkFileExistence(r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r1 == 0) goto L18
            com.badlogic.gdx.utils.I18NBundle r1 = new com.badlogic.gdx.utils.I18NBundle     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            java.io.Reader r0 = r2.reader(r3)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            r1.load(r0)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            goto L19
        L18:
            r1 = r0
        L19:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            if (r1 == 0) goto L21
            r1.setLocale(r4)
        L21:
            return r1
        L22:
            r2 = move-exception
            goto L2b
        L24:
            r2 = move-exception
            com.badlogic.gdx.utils.GdxRuntimeException r3 = new com.badlogic.gdx.utils.GdxRuntimeException     // Catch: java.lang.Throwable -> L22
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L22
        L2b:
            com.badlogic.gdx.utils.StreamUtils.closeQuietly(r0)
            throw r2
    }

    private static com.badlogic.gdx.utils.I18NBundle loadBundleChain(com.badlogic.gdx.files.FileHandle r2, java.lang.String r3, java.util.List<java.util.Locale> r4, int r5, com.badlogic.gdx.utils.I18NBundle r6) {
            java.lang.Object r0 = r4.get(r5)
            java.util.Locale r0 = (java.util.Locale) r0
            int r1 = r4.size()
            int r1 = r1 + (-1)
            if (r5 == r1) goto L15
            int r5 = r5 + 1
            com.badlogic.gdx.utils.I18NBundle r4 = loadBundleChain(r2, r3, r4, r5, r6)
            goto L21
        L15:
            if (r6 == 0) goto L20
            java.util.Locale r4 = com.badlogic.gdx.utils.I18NBundle.ROOT_LOCALE
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L20
            return r6
        L20:
            r4 = 0
        L21:
            com.badlogic.gdx.utils.I18NBundle r2 = loadBundle(r2, r3, r0)
            if (r2 == 0) goto L2a
            r2.parent = r4
            return r2
        L2a:
            return r4
    }

    private void setLocale(java.util.Locale r3) {
            r2 = this;
            r2.locale = r3
            com.badlogic.gdx.utils.TextFormatter r0 = new com.badlogic.gdx.utils.TextFormatter
            boolean r1 = com.badlogic.gdx.utils.I18NBundle.simpleFormatter
            r1 = r1 ^ 1
            r0.<init>(r3, r1)
            r2.formatter = r0
            return
    }

    public static void setSimpleFormatter(boolean r0) {
            com.badlogic.gdx.utils.I18NBundle.simpleFormatter = r0
            return
    }

    private static com.badlogic.gdx.files.FileHandle toFileHandle(com.badlogic.gdx.files.FileHandle r6, java.util.Locale r7) {
            com.badlogic.gdx.utils.StringBuilder r0 = new com.badlogic.gdx.utils.StringBuilder
            java.lang.String r1 = r6.name()
            r0.<init>(r1)
            java.util.Locale r1 = com.badlogic.gdx.utils.I18NBundle.ROOT_LOCALE
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = r7.getLanguage()
            java.lang.String r2 = r7.getCountry()
            java.lang.String r7 = r7.getVariant()
            java.lang.String r3 = ""
            boolean r4 = r3.equals(r1)
            boolean r5 = r3.equals(r2)
            boolean r3 = r3.equals(r7)
            if (r4 == 0) goto L31
            if (r5 == 0) goto L31
            if (r3 != 0) goto L5d
        L31:
            r4 = 95
            r0.append(r4)
            if (r3 != 0) goto L4c
            com.badlogic.gdx.utils.StringBuilder r1 = r0.append(r1)
            com.badlogic.gdx.utils.StringBuilder r1 = r1.append(r4)
            com.badlogic.gdx.utils.StringBuilder r1 = r1.append(r2)
            com.badlogic.gdx.utils.StringBuilder r1 = r1.append(r4)
            r1.append(r7)
            goto L5d
        L4c:
            if (r5 != 0) goto L5a
            com.badlogic.gdx.utils.StringBuilder r7 = r0.append(r1)
            com.badlogic.gdx.utils.StringBuilder r7 = r7.append(r4)
            r7.append(r2)
            goto L5d
        L5a:
            r0.append(r1)
        L5d:
            java.lang.String r7 = ".properties"
            com.badlogic.gdx.utils.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            com.badlogic.gdx.files.FileHandle r6 = r6.sibling(r7)
            return r6
    }

    public java.lang.String format(java.lang.String r2, java.lang.Object... r3) {
            r1 = this;
            com.badlogic.gdx.utils.TextFormatter r0 = r1.formatter
            java.lang.String r2 = r1.get(r2)
            java.lang.String r2 = r0.format(r2, r3)
            return r2
    }

    public java.lang.String get(java.lang.String r4) {
            r3 = this;
            com.badlogic.gdx.utils.ObjectMap<java.lang.String, java.lang.String> r0 = r3.properties
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4c
            com.badlogic.gdx.utils.I18NBundle r1 = r3.parent
            if (r1 == 0) goto L12
            java.lang.String r0 = r1.get(r4)
        L12:
            if (r0 != 0) goto L4c
            boolean r0 = com.badlogic.gdx.utils.I18NBundle.exceptionOnMissingKey
            if (r0 != 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "???"
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
        L2d:
            java.util.MissingResourceException r0 = new java.util.MissingResourceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't find bundle key "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r0.<init>(r1, r2, r4)
            throw r0
        L4c:
            return r0
    }

    public java.util.Locale getLocale() {
            r1 = this;
            java.util.Locale r0 = r1.locale
            return r0
    }

    protected void load(java.io.Reader r2) throws java.io.IOException {
            r1 = this;
            com.badlogic.gdx.utils.ObjectMap r0 = new com.badlogic.gdx.utils.ObjectMap
            r0.<init>()
            r1.properties = r0
            com.badlogic.gdx.utils.PropertiesUtils.load(r0, r2)
            return
    }
}
