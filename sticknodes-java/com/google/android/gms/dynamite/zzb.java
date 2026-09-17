package com.google.android.gms.dynamite;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
public final class zzb {
    private static java.lang.ClassLoader zza;
    private static java.lang.Thread zzb;

    static {
            return
    }

    public static synchronized java.lang.ClassLoader zza() {
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> Ld5
            if (r1 != 0) goto Ld1
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> Ld5
            r2 = 0
            if (r1 != 0) goto La6
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Ld5
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> Ld5
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> Ld5
            if (r1 != 0) goto L1d
            r1 = r2
            goto L9f
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Ld5
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            r6 = 0
            r7 = 0
        L2b:
            if (r7 >= r4) goto L3f
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            if (r9 == 0) goto L3c
            goto L40
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r8 = r2
        L40:
            if (r8 != 0) goto L49
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
        L49:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
        L52:
            if (r6 >= r1) goto L66
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            if (r7 == 0) goto L63
            goto L67
        L63:
            int r6 = r6 + 1
            goto L52
        L66:
            r5 = r2
        L67:
            if (r5 != 0) goto L9d
            com.google.android.gms.dynamite.zza r1 = new com.google.android.gms.dynamite.zza     // Catch: java.lang.SecurityException -> L7b java.lang.Throwable -> L7e
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.SecurityException -> L7b java.lang.Throwable -> L7e
            r1.setContextClassLoader(r2)     // Catch: java.lang.SecurityException -> L78 java.lang.Throwable -> L7e
            r1.start()     // Catch: java.lang.SecurityException -> L78 java.lang.Throwable -> L7e
            r5 = r1
            goto L9d
        L78:
            r4 = move-exception
            r5 = r1
            goto L83
        L7b:
            r1 = move-exception
            r4 = r1
            goto L83
        L7e:
            r1 = move-exception
            goto La4
        L80:
            r1 = move-exception
            r4 = r1
            r5 = r2
        L83:
            java.lang.String r1 = "DynamiteLoaderV2CL"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L7e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r6.<init>()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = "Failed to enumerate thread/threadgroup "
            r6.append(r7)     // Catch: java.lang.Throwable -> L7e
            r6.append(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L7e
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L7e
        L9d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7e
            r1 = r5
        L9f:
            com.google.android.gms.dynamite.zzb.zzb = r1     // Catch: java.lang.Throwable -> Ld5
            if (r1 != 0) goto La6
            goto Lcc
        La4:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7e
            throw r1     // Catch: java.lang.Throwable -> Ld5
        La6:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Ld5
            java.lang.Thread r3 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> Lae java.lang.SecurityException -> Lb0
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> Lae java.lang.SecurityException -> Lb0
            goto Lcb
        Lae:
            r2 = move-exception
            goto Lcf
        Lb0:
            r3 = move-exception
            java.lang.String r4 = "DynamiteLoaderV2CL"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> Lae
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lae
            r5.<init>()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r6 = "Failed to get thread context classloader "
            r5.append(r6)     // Catch: java.lang.Throwable -> Lae
            r5.append(r3)     // Catch: java.lang.Throwable -> Lae
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> Lae
            android.util.Log.w(r4, r3)     // Catch: java.lang.Throwable -> Lae
        Lcb:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
        Lcc:
            com.google.android.gms.dynamite.zzb.zza = r2     // Catch: java.lang.Throwable -> Ld5
            goto Ld1
        Lcf:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
            throw r2     // Catch: java.lang.Throwable -> Ld5
        Ld1:
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> Ld5
            monitor-exit(r0)
            return r1
        Ld5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
