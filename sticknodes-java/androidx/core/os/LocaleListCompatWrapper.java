package androidx.core.os;

/* loaded from: classes.dex */
final class LocaleListCompatWrapper implements androidx.core.os.LocaleListInterface {
    private static final java.util.Locale EN_LATN = null;
    private static final java.util.Locale LOCALE_AR_XB = null;
    private static final java.util.Locale LOCALE_EN_XA = null;
    private static final java.util.Locale[] sEmptyList = null;
    private final java.util.Locale[] mList;
    private final java.lang.String mStringRepresentation;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            androidx.core.os.LocaleListCompatWrapper.sEmptyList = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "en"
            java.lang.String r2 = "XA"
            r0.<init>(r1, r2)
            androidx.core.os.LocaleListCompatWrapper.LOCALE_EN_XA = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "ar"
            java.lang.String r2 = "XB"
            r0.<init>(r1, r2)
            androidx.core.os.LocaleListCompatWrapper.LOCALE_AR_XB = r0
            java.lang.String r0 = "en-Latn"
            java.util.Locale r0 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r0)
            androidx.core.os.LocaleListCompatWrapper.EN_LATN = r0
            return
    }

    LocaleListCompatWrapper(java.util.Locale... r8) {
            r7 = this;
            r7.<init>()
            int r0 = r8.length
            if (r0 != 0) goto Lf
            java.util.Locale[] r8 = androidx.core.os.LocaleListCompatWrapper.sEmptyList
            r7.mList = r8
            java.lang.String r8 = ""
            r7.mStringRepresentation = r8
            goto L75
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            r4 = 0
        L20:
            int r5 = r8.length
            if (r4 >= r5) goto L65
            r5 = r8[r4]
            if (r5 == 0) goto L49
            boolean r6 = r1.contains(r5)
            if (r6 != 0) goto L46
            java.lang.Object r5 = r5.clone()
            java.util.Locale r5 = (java.util.Locale) r5
            r0.add(r5)
            toLanguageTag(r2, r5)
            int r6 = r8.length
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L43
            r6 = 44
            r2.append(r6)
        L43:
            r1.add(r5)
        L46:
            int r4 = r4 + 1
            goto L20
        L49:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "list["
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "] is null"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L65:
            java.util.Locale[] r8 = new java.util.Locale[r3]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.util.Locale[] r8 = (java.util.Locale[]) r8
            r7.mList = r8
            java.lang.String r8 = r2.toString()
            r7.mStringRepresentation = r8
        L75:
            return
    }

    static void toLanguageTag(java.lang.StringBuilder r1, java.util.Locale r2) {
            java.lang.String r0 = r2.getLanguage()
            r1.append(r0)
            java.lang.String r0 = r2.getCountry()
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            r0 = 45
            r1.append(r0)
            java.lang.String r2 = r2.getCountry()
            r1.append(r2)
        L1f:
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.core.os.LocaleListCompatWrapper
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.core.os.LocaleListCompatWrapper r6 = (androidx.core.os.LocaleListCompatWrapper) r6
            java.util.Locale[] r6 = r6.mList
            java.util.Locale[] r1 = r5.mList
            int r1 = r1.length
            int r3 = r6.length
            if (r1 == r3) goto L15
            return r2
        L15:
            r1 = 0
        L16:
            java.util.Locale[] r3 = r5.mList
            int r4 = r3.length
            if (r1 >= r4) goto L29
            r3 = r3[r1]
            r4 = r6[r1]
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L16
        L29:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale get(int r3) {
            r2 = this;
            if (r3 < 0) goto La
            java.util.Locale[] r0 = r2.mList
            int r1 = r0.length
            if (r3 >= r1) goto La
            r3 = r0[r3]
            goto Lb
        La:
            r3 = 0
        Lb:
            return r3
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.Object getLocaleList() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.util.Locale[] r0 = r5.mList
            int r1 = r0.length
            r2 = 1
            r3 = 0
        L5:
            if (r3 >= r1) goto L13
            r4 = r0[r3]
            int r2 = r2 * 31
            int r4 = r4.hashCode()
            int r2 = r2 + r4
            int r3 = r3 + 1
            goto L5
        L13:
            return r2
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            r1 = 0
        Lb:
            java.util.Locale[] r2 = r4.mList
            int r3 = r2.length
            if (r1 >= r3) goto L24
            r2 = r2[r1]
            r0.append(r2)
            java.util.Locale[] r2 = r4.mList
            int r2 = r2.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L21
            r2 = 44
            r0.append(r2)
        L21:
            int r1 = r1 + 1
            goto Lb
        L24:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
