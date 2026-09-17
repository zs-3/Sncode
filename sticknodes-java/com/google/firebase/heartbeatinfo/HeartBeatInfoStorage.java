package com.google.firebase.heartbeatinfo;

/* loaded from: classes2.dex */
class HeartBeatInfoStorage {
    private final android.content.SharedPreferences firebaseSharedPreferences;

    static {
            return
    }

    public HeartBeatInfoStorage(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "FirebaseHeartBeat"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r0 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            r2.firebaseSharedPreferences = r3
            return
    }

    private synchronized void cleanUpStoredHeartBeats() {
            r9 = this;
            monitor-enter(r9)
            android.content.SharedPreferences r0 = r9.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "fire-count"
            r2 = 0
            long r0 = r0.getLong(r1, r2)     // Catch: java.lang.Throwable -> L82
            r2 = 0
            java.lang.String r3 = ""
            android.content.SharedPreferences r4 = r9.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L82
            java.util.Map r4 = r4.getAll()     // Catch: java.lang.Throwable -> L82
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L82
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L82
        L1c:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L82
            if (r5 == 0) goto L57
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L82
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L82
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Throwable -> L82
            boolean r6 = r6 instanceof java.util.Set     // Catch: java.lang.Throwable -> L82
            if (r6 == 0) goto L1c
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Throwable -> L82
            java.util.Set r6 = (java.util.Set) r6     // Catch: java.lang.Throwable -> L82
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L82
        L3a:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L82
            if (r7 == 0) goto L1c
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L82
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L82
            if (r2 == 0) goto L4e
            int r8 = r2.compareTo(r7)     // Catch: java.lang.Throwable -> L82
            if (r8 <= 0) goto L3a
        L4e:
            java.lang.Object r2 = r5.getKey()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L82
            r3 = r2
            r2 = r7
            goto L3a
        L57:
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L82
            android.content.SharedPreferences r5 = r9.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L82
            java.util.HashSet r6 = new java.util.HashSet     // Catch: java.lang.Throwable -> L82
            r6.<init>()     // Catch: java.lang.Throwable -> L82
            java.util.Set r5 = r5.getStringSet(r3, r6)     // Catch: java.lang.Throwable -> L82
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L82
            r4.remove(r2)     // Catch: java.lang.Throwable -> L82
            android.content.SharedPreferences r2 = r9.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L82
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L82
            android.content.SharedPreferences$Editor r2 = r2.putStringSet(r3, r4)     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "fire-count"
            r4 = 1
            long r0 = r0 - r4
            android.content.SharedPreferences$Editor r0 = r2.putLong(r3, r0)     // Catch: java.lang.Throwable -> L82
            r0.commit()     // Catch: java.lang.Throwable -> L82
            monitor-exit(r9)
            return
        L82:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
    }

    private synchronized java.lang.String getFormattedDate(long r4) {
            r3 = this;
            monitor-enter(r3)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L36
            r1 = 26
            if (r0 < r1) goto L22
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L36
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L36
            java.time.Instant r4 = r0.toInstant()     // Catch: java.lang.Throwable -> L36
            java.time.ZoneOffset r5 = java.time.ZoneOffset.UTC     // Catch: java.lang.Throwable -> L36
            java.time.OffsetDateTime r4 = r4.atOffset(r5)     // Catch: java.lang.Throwable -> L36
            java.time.LocalDateTime r4 = r4.toLocalDateTime()     // Catch: java.lang.Throwable -> L36
            java.time.format.DateTimeFormatter r5 = java.time.format.DateTimeFormatter.ISO_LOCAL_DATE     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = r4.format(r5)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return r4
        L22:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r2 = java.util.Locale.UK     // Catch: java.lang.Throwable -> L36
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L36
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L36
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = r0.format(r1)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r3)
            return r4
        L36:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    private synchronized java.lang.String getStoredUserAgentString(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            android.content.SharedPreferences r0 = r4.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L4a
            java.util.Map r0 = r0.getAll()     // Catch: java.lang.Throwable -> L4a
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4a
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L4a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L4a
            boolean r2 = r2 instanceof java.util.Set     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L4a
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4a
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4a
            boolean r3 = r5.equals(r3)     // Catch: java.lang.Throwable -> L4a
            if (r3 == 0) goto L2d
            java.lang.Object r5 = r1.getKey()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r4)
            return r5
        L47:
            r5 = 0
            monitor-exit(r4)
            return r5
        L4a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private synchronized void removeStoredDate(java.lang.String r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.getStoredUserAgentString(r5)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L9
            monitor-exit(r4)
            return
        L9:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r4.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L3f
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.lang.Throwable -> L3f
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            r1.remove(r5)     // Catch: java.lang.Throwable -> L3f
            boolean r5 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L30
            android.content.SharedPreferences r5 = r4.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch: java.lang.Throwable -> L3f
            r5.commit()     // Catch: java.lang.Throwable -> L3f
            goto L3d
        L30:
            android.content.SharedPreferences r5 = r4.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch: java.lang.Throwable -> L3f
            r5.commit()     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r4)
            return
        L3f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
    }

    private synchronized void updateStoredUserAgent(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            monitor-enter(r3)
            r3.removeStoredDate(r5)     // Catch: java.lang.Throwable -> L26
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L26
            android.content.SharedPreferences r1 = r3.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L26
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L26
            r2.<init>()     // Catch: java.lang.Throwable -> L26
            java.util.Set r1 = r1.getStringSet(r4, r2)     // Catch: java.lang.Throwable -> L26
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L26
            r0.add(r5)     // Catch: java.lang.Throwable -> L26
            android.content.SharedPreferences r5 = r3.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L26
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch: java.lang.Throwable -> L26
            android.content.SharedPreferences$Editor r4 = r5.putStringSet(r4, r0)     // Catch: java.lang.Throwable -> L26
            r4.commit()     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            return
        L26:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
    }

    synchronized void deleteAllHeartBeats() {
            r7 = this;
            monitor-enter(r7)
            android.content.SharedPreferences r0 = r7.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L69
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L69
            r1 = 0
            android.content.SharedPreferences r2 = r7.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L69
            java.util.Map r2 = r2.getAll()     // Catch: java.lang.Throwable -> L69
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L69
        L16:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L69
            boolean r4 = r4 instanceof java.util.Set     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L16
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L69
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L69
            java.lang.String r5 = r7.getFormattedDate(r5)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r3 = r3.getKey()     // Catch: java.lang.Throwable -> L69
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L69
            boolean r4 = r4.contains(r5)     // Catch: java.lang.Throwable -> L69
            if (r4 == 0) goto L52
            java.util.HashSet r4 = new java.util.HashSet     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            r4.add(r5)     // Catch: java.lang.Throwable -> L69
            int r1 = r1 + 1
            r0.putStringSet(r3, r4)     // Catch: java.lang.Throwable -> L69
            goto L16
        L52:
            r0.remove(r3)     // Catch: java.lang.Throwable -> L69
            goto L16
        L56:
            if (r1 != 0) goto L5e
            java.lang.String r1 = "fire-count"
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            goto L64
        L5e:
            java.lang.String r2 = "fire-count"
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L69
            r0.putLong(r2, r3)     // Catch: java.lang.Throwable -> L69
        L64:
            r0.commit()     // Catch: java.lang.Throwable -> L69
            monitor-exit(r7)
            return
        L69:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
    }

    synchronized java.util.List<com.google.firebase.heartbeatinfo.HeartBeatResult> getAllHeartBeats() {
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L60
            r0.<init>()     // Catch: java.lang.Throwable -> L60
            android.content.SharedPreferences r1 = r6.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L60
            java.util.Map r1 = r1.getAll()     // Catch: java.lang.Throwable -> L60
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L60
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L60
        L14:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L60
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L60
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r2.getValue()     // Catch: java.lang.Throwable -> L60
            boolean r3 = r3 instanceof java.util.Set     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L14
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L60
            java.lang.Object r4 = r2.getValue()     // Catch: java.lang.Throwable -> L60
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L60
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L60
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r6.getFormattedDate(r4)     // Catch: java.lang.Throwable -> L60
            r3.remove(r4)     // Catch: java.lang.Throwable -> L60
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r4 != 0) goto L14
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L60
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L60
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L60
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L60
            com.google.firebase.heartbeatinfo.HeartBeatResult r2 = com.google.firebase.heartbeatinfo.HeartBeatResult.create(r2, r4)     // Catch: java.lang.Throwable -> L60
            r0.add(r2)     // Catch: java.lang.Throwable -> L60
            goto L14
        L57:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L60
            r6.updateGlobalHeartBeat(r1)     // Catch: java.lang.Throwable -> L60
            monitor-exit(r6)
            return r0
        L60:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    synchronized void storeHeartBeat(long r12, java.lang.String r14) {
            r11 = this;
            monitor-enter(r11)
            java.lang.String r12 = r11.getFormattedDate(r12)     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences r13 = r11.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "last-used-date"
            java.lang.String r1 = ""
            java.lang.String r13 = r13.getString(r0, r1)     // Catch: java.lang.Throwable -> L78
            boolean r13 = r13.equals(r12)     // Catch: java.lang.Throwable -> L78
            if (r13 == 0) goto L2a
            java.lang.String r13 = r11.getStoredUserAgentString(r12)     // Catch: java.lang.Throwable -> L78
            if (r13 != 0) goto L1d
            monitor-exit(r11)
            return
        L1d:
            boolean r13 = r13.equals(r14)     // Catch: java.lang.Throwable -> L78
            if (r13 == 0) goto L25
            monitor-exit(r11)
            return
        L25:
            r11.updateStoredUserAgent(r14, r12)     // Catch: java.lang.Throwable -> L78
            monitor-exit(r11)
            return
        L2a:
            android.content.SharedPreferences r13 = r11.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "fire-count"
            r1 = 0
            long r3 = r13.getLong(r0, r1)     // Catch: java.lang.Throwable -> L78
            r5 = 1
            long r7 = r3 + r5
            r9 = 30
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 != 0) goto L49
            r11.cleanUpStoredHeartBeats()     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences r13 = r11.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L78
            java.lang.String r0 = "fire-count"
            long r3 = r13.getLong(r0, r1)     // Catch: java.lang.Throwable -> L78
        L49:
            java.util.HashSet r13 = new java.util.HashSet     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences r0 = r11.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L78
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L78
            r1.<init>()     // Catch: java.lang.Throwable -> L78
            java.util.Set r0 = r0.getStringSet(r14, r1)     // Catch: java.lang.Throwable -> L78
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L78
            r13.add(r12)     // Catch: java.lang.Throwable -> L78
            long r3 = r3 + r5
            android.content.SharedPreferences r0 = r11.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L78
            android.content.SharedPreferences$Editor r13 = r0.putStringSet(r14, r13)     // Catch: java.lang.Throwable -> L78
            java.lang.String r14 = "fire-count"
            android.content.SharedPreferences$Editor r13 = r13.putLong(r14, r3)     // Catch: java.lang.Throwable -> L78
            java.lang.String r14 = "last-used-date"
            android.content.SharedPreferences$Editor r12 = r13.putString(r14, r12)     // Catch: java.lang.Throwable -> L78
            r12.commit()     // Catch: java.lang.Throwable -> L78
            monitor-exit(r11)
            return
        L78:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
    }

    synchronized void updateGlobalHeartBeat(long r3) {
            r2 = this;
            monitor-enter(r2)
            android.content.SharedPreferences r0 = r2.firebaseSharedPreferences     // Catch: java.lang.Throwable -> L12
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "fire-global"
            android.content.SharedPreferences$Editor r3 = r0.putLong(r1, r3)     // Catch: java.lang.Throwable -> L12
            r3.commit()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)
            return
        L12:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }
}
