package androidx.core.content.res;

/* loaded from: classes.dex */
public final class ResourcesCompat {
    private static final java.lang.Object sColorStateCacheLock = null;
    private static final java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry>> sColorStateCaches = null;
    private static final java.lang.ThreadLocal<android.util.TypedValue> sTempTypedValue = null;

    static class Api23Impl {
        static int getColor(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                int r0 = r0.getColor(r1, r2)
                return r0
        }

        static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r0, int r1, android.content.res.Resources.Theme r2) {
                android.content.res.ColorStateList r0 = r0.getColorStateList(r1, r2)
                return r0
        }
    }

    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration mConfiguration;
        final int mThemeHash;
        final android.content.res.ColorStateList mValue;

        ColorStateListCacheEntry(android.content.res.ColorStateList r1, android.content.res.Configuration r2, android.content.res.Resources.Theme r3) {
                r0 = this;
                r0.<init>()
                r0.mValue = r1
                r0.mConfiguration = r2
                if (r3 != 0) goto Lb
                r1 = 0
                goto Lf
            Lb:
                int r1 = r3.hashCode()
            Lf:
                r0.mThemeHash = r1
                return
        }
    }

    private static final class ColorStateListCacheKey {
        final android.content.res.Resources mResources;
        final android.content.res.Resources.Theme mTheme;

        ColorStateListCacheKey(android.content.res.Resources r1, android.content.res.Resources.Theme r2) {
                r0 = this;
                r0.<init>()
                r0.mResources = r1
                r0.mTheme = r2
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L29
                java.lang.Class<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey> r2 = androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey.class
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L10
                goto L29
            L10:
                androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r5 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey) r5
                android.content.res.Resources r2 = r4.mResources
                android.content.res.Resources r3 = r5.mResources
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L27
                android.content.res.Resources$Theme r2 = r4.mTheme
                android.content.res.Resources$Theme r5 = r5.mTheme
                boolean r5 = androidx.core.util.ObjectsCompat.equals(r2, r5)
                if (r5 == 0) goto L27
                goto L28
            L27:
                r0 = 0
            L28:
                return r0
            L29:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                android.content.res.Resources r1 = r3.mResources
                r2 = 0
                r0[r2] = r1
                android.content.res.Resources$Theme r1 = r3.mTheme
                r2 = 1
                r0[r2] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sTempTypedValue = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            androidx.core.content.res.ResourcesCompat.sColorStateCaches = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.content.res.ResourcesCompat.sColorStateCacheLock = r0
            return
    }

    private static void addColorStateListToCache(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r3, int r4, android.content.res.ColorStateList r5, android.content.res.Resources.Theme r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L25
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L15
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L25
            r2.<init>()     // Catch: java.lang.Throwable -> L25
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L25
        L15:
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r1 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry     // Catch: java.lang.Throwable -> L25
            android.content.res.Resources r3 = r3.mResources     // Catch: java.lang.Throwable -> L25
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L25
            r1.<init>(r5, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2.append(r4, r1)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    private static android.content.res.ColorStateList getCachedColorStateList(androidx.core.content.res.ResourcesCompat.ColorStateListCacheKey r5, int r6) {
            java.lang.Object r0 = androidx.core.content.res.ResourcesCompat.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey, android.util.SparseArray<androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry>> r1 = androidx.core.content.res.ResourcesCompat.sColorStateCaches     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L45
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L42
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L45
            if (r2 <= 0) goto L42
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L45
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheEntry r2 = (androidx.core.content.res.ResourcesCompat.ColorStateListCacheEntry) r2     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L42
            android.content.res.Configuration r3 = r2.mConfiguration     // Catch: java.lang.Throwable -> L45
            android.content.res.Resources r4 = r5.mResources     // Catch: java.lang.Throwable -> L45
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L45
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L3f
            android.content.res.Resources$Theme r5 = r5.mTheme     // Catch: java.lang.Throwable -> L45
            if (r5 != 0) goto L31
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L3b
        L31:
            if (r5 == 0) goto L3f
            int r3 = r2.mThemeHash     // Catch: java.lang.Throwable -> L45
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L45
            if (r3 != r5) goto L3f
        L3b:
            android.content.res.ColorStateList r5 = r2.mValue     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return r5
        L3f:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L45
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r5 = 0
            return r5
        L45:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r5
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.res.Resources r2, int r3, android.content.res.Resources.Theme r4) throws android.content.res.Resources.NotFoundException {
            androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey r0 = new androidx.core.content.res.ResourcesCompat$ColorStateListCacheKey
            r0.<init>(r2, r4)
            android.content.res.ColorStateList r1 = getCachedColorStateList(r0, r3)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            android.content.res.ColorStateList r1 = inflateColorStateList(r2, r3, r4)
            if (r1 == 0) goto L16
            addColorStateListToCache(r0, r3, r1, r4)
            return r1
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L21
            android.content.res.ColorStateList r2 = androidx.core.content.res.ResourcesCompat.Api23Impl.getColorStateList(r2, r3, r4)
            return r2
        L21:
            android.content.res.ColorStateList r2 = r2.getColorStateList(r3)
            return r2
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.ResourcesCompat.sTempTypedValue
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    private static android.content.res.ColorStateList inflateColorStateList(android.content.res.Resources r2, int r3, android.content.res.Resources.Theme r4) {
            boolean r0 = isColorInt(r2, r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.XmlResourceParser r3 = r2.getXml(r3)
            android.content.res.ColorStateList r2 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(r2, r3, r4)     // Catch: java.lang.Exception -> L11
            return r2
        L11:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r4 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r4, r2)
            return r1
    }

    private static boolean isColorInt(android.content.res.Resources r2, int r3) {
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L13
            r3 = 31
            if (r2 > r3) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }
}
