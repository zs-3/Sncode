package androidx.core.os;

/* loaded from: classes.dex */
public final class LocaleListCompat {
    private static final androidx.core.os.LocaleListCompat sEmptyLocaleList = null;
    private final androidx.core.os.LocaleListInterface mImpl;

    static class Api24Impl {
        static android.os.LocaleList createLocaleList(java.util.Locale... r1) {
                android.os.LocaleList r0 = new android.os.LocaleList
                r0.<init>(r1)
                return r0
        }

        static android.os.LocaleList getAdjustedDefault() {
                android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
                return r0
        }

        static android.os.LocaleList getDefault() {
                android.os.LocaleList r0 = android.os.LocaleList.getDefault()
                return r0
        }
    }

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            androidx.core.os.LocaleListCompat r0 = create(r0)
            androidx.core.os.LocaleListCompat.sEmptyLocaleList = r0
            return
    }

    private LocaleListCompat(androidx.core.os.LocaleListInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    public static androidx.core.os.LocaleListCompat create(java.util.Locale... r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            android.os.LocaleList r2 = androidx.core.os.LocaleListCompat.Api24Impl.createLocaleList(r2)
            androidx.core.os.LocaleListCompat r2 = wrap(r2)
            return r2
        Lf:
            androidx.core.os.LocaleListCompat r0 = new androidx.core.os.LocaleListCompat
            androidx.core.os.LocaleListCompatWrapper r1 = new androidx.core.os.LocaleListCompatWrapper
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    static java.util.Locale forLanguageTagCompat(java.lang.String r6) {
            java.lang.String r0 = "-"
            boolean r1 = r6.contains(r0)
            r2 = -1
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L37
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L1f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L1f:
            int r1 = r0.length
            if (r1 <= r5) goto L2c
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L2c:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L37:
            java.lang.String r0 = "_"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L86
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L52
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L52:
            int r1 = r0.length
            if (r1 <= r5) goto L5f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L5f:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can not parse language tag: ["
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = "]"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L86:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r6)
            return r0
    }

    public static androidx.core.os.LocaleListCompat wrap(android.os.LocaleList r2) {
            androidx.core.os.LocaleListCompat r0 = new androidx.core.os.LocaleListCompat
            androidx.core.os.LocaleListPlatformWrapper r1 = new androidx.core.os.LocaleListPlatformWrapper
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.os.LocaleListCompat
            if (r0 == 0) goto L12
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            androidx.core.os.LocaleListCompat r2 = (androidx.core.os.LocaleListCompat) r2
            androidx.core.os.LocaleListInterface r2 = r2.mImpl
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public java.util.Locale get(int r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.util.Locale r2 = r0.get(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.String r0 = r0.toString()
            return r0
    }
}
