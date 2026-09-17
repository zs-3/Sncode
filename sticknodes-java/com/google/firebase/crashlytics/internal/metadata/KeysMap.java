package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes2.dex */
class KeysMap {
    private final java.util.Map<java.lang.String, java.lang.String> keys;
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.keys = r0
            r1.maxEntries = r2
            r1.maxEntryLength = r3
            return
    }

    private java.lang.String sanitizeKey(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L9
            int r0 = r1.maxEntryLength
            java.lang.String r2 = sanitizeString(r2, r0)
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Custom attribute key must not be null."
            r2.<init>(r0)
            throw r2
    }

    public static java.lang.String sanitizeString(java.lang.String r1, int r2) {
            if (r1 == 0) goto L11
            java.lang.String r1 = r1.trim()
            int r0 = r1.length()
            if (r0 <= r2) goto L11
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
        L11:
            return r1
    }

    public synchronized java.util.Map<java.lang.String, java.lang.String> getKeys() {
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.keys     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized boolean setKey(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.sanitizeKey(r5)     // Catch: java.lang.Throwable -> L5f
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.keys     // Catch: java.lang.Throwable -> L5f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5f
            int r2 = r4.maxEntries     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            if (r1 < r2) goto L3d
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.keys     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L19
            goto L3d
        L19:
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "Ignored entry \""
            r0.append(r1)     // Catch: java.lang.Throwable -> L5f
            r0.append(r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = "\" when adding custom keys. Maximum allowable: "
            r0.append(r5)     // Catch: java.lang.Throwable -> L5f
            int r5 = r4.maxEntries     // Catch: java.lang.Throwable -> L5f
            r0.append(r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            r6.w(r5)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r4)
            return r3
        L3d:
            int r5 = r4.maxEntryLength     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = sanitizeString(r6, r5)     // Catch: java.lang.Throwable -> L5f
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.keys     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5f
            boolean r1 = com.google.firebase.crashlytics.internal.common.CommonUtils.nullSafeEquals(r1, r5)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L53
            monitor-exit(r4)
            return r3
        L53:
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.keys     // Catch: java.lang.Throwable -> L5f
            if (r6 != 0) goto L59
            java.lang.String r5 = ""
        L59:
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> L5f
            r5 = 1
            monitor-exit(r4)
            return r5
        L5f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    public synchronized void setKeys(java.util.Map<java.lang.String, java.lang.String> r6) {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> L73
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L73
        La:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L73
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L73
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r5.sanitizeKey(r2)     // Catch: java.lang.Throwable -> L73
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.keys     // Catch: java.lang.Throwable -> L73
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L73
            int r4 = r5.maxEntries     // Catch: java.lang.Throwable -> L73
            if (r3 < r4) goto L36
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.keys     // Catch: java.lang.Throwable -> L73
            boolean r3 = r3.containsKey(r2)     // Catch: java.lang.Throwable -> L73
            if (r3 == 0) goto L33
            goto L36
        L33:
            int r0 = r0 + 1
            goto La
        L36:
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L73
            java.util.Map<java.lang.String, java.lang.String> r3 = r5.keys     // Catch: java.lang.Throwable -> L73
            if (r1 != 0) goto L43
            java.lang.String r1 = ""
            goto L49
        L43:
            int r4 = r5.maxEntryLength     // Catch: java.lang.Throwable -> L73
            java.lang.String r1 = sanitizeString(r1, r4)     // Catch: java.lang.Throwable -> L73
        L49:
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L73
            goto La
        L4d:
            if (r0 <= 0) goto L71
            com.google.firebase.crashlytics.internal.Logger r6 = com.google.firebase.crashlytics.internal.Logger.getLogger()     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r1.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = "Ignored "
            r1.append(r2)     // Catch: java.lang.Throwable -> L73
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = " entries when adding custom keys. Maximum allowable: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            int r0 = r5.maxEntries     // Catch: java.lang.Throwable -> L73
            r1.append(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L73
            r6.w(r0)     // Catch: java.lang.Throwable -> L73
        L71:
            monitor-exit(r5)
            return
        L73:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }
}
