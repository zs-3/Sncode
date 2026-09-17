package org.apache.commons.lang3.time;

import java.text.Format;

/* loaded from: classes2.dex */
abstract class FormatCache<F extends java.text.Format> {
    static final int NONE = -1;
    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, java.lang.String> cDateTimeInstanceCache = null;
    private final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache.MultipartKey, F> cInstanceCache;

    private static class MultipartKey {
        private int hashCode;
        private final java.lang.Object[] keys;

        MultipartKey(java.lang.Object... r1) {
                r0 = this;
                r0.<init>()
                r0.keys = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                java.lang.Object[] r0 = r1.keys
                org.apache.commons.lang3.time.FormatCache$MultipartKey r2 = (org.apache.commons.lang3.time.FormatCache.MultipartKey) r2
                java.lang.Object[] r2 = r2.keys
                boolean r2 = java.util.Arrays.equals(r0, r2)
                return r2
        }

        public int hashCode() {
                r5 = this;
                int r0 = r5.hashCode
                if (r0 != 0) goto L1b
                java.lang.Object[] r0 = r5.keys
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L9:
                if (r2 >= r1) goto L19
                r4 = r0[r2]
                if (r4 == 0) goto L16
                int r3 = r3 * 7
                int r4 = r4.hashCode()
                int r3 = r3 + r4
            L16:
                int r2 = r2 + 1
                goto L9
            L19:
                r5.hashCode = r3
            L1b:
                int r0 = r5.hashCode
                return r0
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 7
            r0.<init>(r1)
            org.apache.commons.lang3.time.FormatCache.cDateTimeInstanceCache = r0
            return
    }

    FormatCache() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 7
            r0.<init>(r1)
            r2.cInstanceCache = r0
            return
    }

    private F getDateTimeInstance(java.lang.Integer r1, java.lang.Integer r2, java.util.TimeZone r3, java.util.Locale r4) {
            r0 = this;
            if (r4 != 0) goto L6
            java.util.Locale r4 = java.util.Locale.getDefault()
        L6:
            java.lang.String r1 = getPatternForStyle(r1, r2, r4)
            java.text.Format r1 = r0.getInstance(r1, r3, r4)
            return r1
    }

    static java.lang.String getPatternForStyle(java.lang.Integer r3, java.lang.Integer r4, java.util.Locale r5) {
            org.apache.commons.lang3.time.FormatCache$MultipartKey r0 = new org.apache.commons.lang3.time.FormatCache$MultipartKey
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r2 = 2
            r1[r2] = r5
            r0.<init>(r1)
            java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache$MultipartKey, java.lang.String> r1 = org.apache.commons.lang3.time.FormatCache.cDateTimeInstanceCache
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L66
            if (r3 != 0) goto L26
            int r3 = r4.intValue()     // Catch: java.lang.ClassCastException -> L4f
            java.text.DateFormat r3 = java.text.DateFormat.getTimeInstance(r3, r5)     // Catch: java.lang.ClassCastException -> L4f
            goto L3d
        L26:
            if (r4 != 0) goto L31
            int r3 = r3.intValue()     // Catch: java.lang.ClassCastException -> L4f
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r3, r5)     // Catch: java.lang.ClassCastException -> L4f
            goto L3d
        L31:
            int r3 = r3.intValue()     // Catch: java.lang.ClassCastException -> L4f
            int r4 = r4.intValue()     // Catch: java.lang.ClassCastException -> L4f
            java.text.DateFormat r3 = java.text.DateFormat.getDateTimeInstance(r3, r4, r5)     // Catch: java.lang.ClassCastException -> L4f
        L3d:
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3     // Catch: java.lang.ClassCastException -> L4f
            java.lang.String r3 = r3.toPattern()     // Catch: java.lang.ClassCastException -> L4f
            java.lang.Object r4 = r1.putIfAbsent(r0, r3)     // Catch: java.lang.ClassCastException -> L4f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassCastException -> L4f
            if (r4 == 0) goto L4d
            r2 = r4
            goto L66
        L4d:
            r2 = r3
            goto L66
        L4f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "No date time pattern for locale: "
            r4.append(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L66:
            return r2
    }

    protected abstract F createInstance(java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3);

    F getDateInstance(int r2, java.util.TimeZone r3, java.util.Locale r4) {
            r1 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 0
            java.text.Format r2 = r1.getDateTimeInstance(r2, r0, r3, r4)
            return r2
    }

    F getDateTimeInstance(int r1, int r2, java.util.TimeZone r3, java.util.Locale r4) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.text.Format r1 = r0.getDateTimeInstance(r1, r2, r3, r4)
            return r1
    }

    public F getInstance() {
            r3 = this;
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 3
            java.text.Format r0 = r3.getDateTimeInstance(r2, r2, r0, r1)
            return r0
    }

    public F getInstance(java.lang.String r4, java.util.TimeZone r5, java.util.Locale r6) {
            r3 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "pattern must not be null"
            org.apache.commons.lang3.Validate.notNull(r4, r2, r1)
            if (r5 != 0) goto Le
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()
        Le:
            if (r6 != 0) goto L14
            java.util.Locale r6 = java.util.Locale.getDefault()
        L14:
            org.apache.commons.lang3.time.FormatCache$MultipartKey r1 = new org.apache.commons.lang3.time.FormatCache$MultipartKey
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r4
            r0 = 1
            r2[r0] = r5
            r0 = 2
            r2[r0] = r6
            r1.<init>(r2)
            java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache$MultipartKey, F extends java.text.Format> r0 = r3.cInstanceCache
            java.lang.Object r0 = r0.get(r1)
            java.text.Format r0 = (java.text.Format) r0
            if (r0 != 0) goto L3d
            java.text.Format r0 = r3.createInstance(r4, r5, r6)
            java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FormatCache$MultipartKey, F extends java.text.Format> r4 = r3.cInstanceCache
            java.lang.Object r4 = r4.putIfAbsent(r1, r0)
            java.text.Format r4 = (java.text.Format) r4
            if (r4 == 0) goto L3d
            r0 = r4
        L3d:
            return r0
    }

    F getTimeInstance(int r2, java.util.TimeZone r3, java.util.Locale r4) {
            r1 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 0
            java.text.Format r2 = r1.getDateTimeInstance(r0, r2, r3, r4)
            return r2
    }
}
