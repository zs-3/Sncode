package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfsx {
    private static final java.util.HashMap zza = null;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfsy zzc;
    private final com.google.android.gms.internal.ads.zzfqz zzd;
    private final com.google.android.gms.internal.ads.zzfqu zze;
    private com.google.android.gms.internal.ads.zzfsm zzf;
    private final java.lang.Object zzg;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.zzfsx.zza = r0
            return
    }

    public zzfsx(android.content.Context r2, com.google.android.gms.internal.ads.zzfsy r3, com.google.android.gms.internal.ads.zzfqz r4, com.google.android.gms.internal.ads.zzfqu r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzg = r0
            r1.zzb = r2
            r1.zzc = r3
            r1.zzd = r4
            r1.zze = r5
            return
    }

    private final synchronized java.lang.Class zzd(com.google.android.gms.internal.ads.zzfsn r7) throws com.google.android.gms.internal.ads.zzfsw {
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzayk r0 = r7.zza()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r0 = r0.zzk()     // Catch: java.lang.Throwable -> L6f
            java.util.HashMap r1 = com.google.android.gms.internal.ads.zzfsx.zza     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L15
            monitor-exit(r6)
            return r2
        L15:
            r2 = 2026(0x7ea, float:2.839E-42)
            com.google.android.gms.internal.ads.zzfqu r3 = r6.zze     // Catch: java.security.GeneralSecurityException -> L68 java.lang.Throwable -> L6f
            java.io.File r4 = r7.zzc()     // Catch: java.security.GeneralSecurityException -> L68 java.lang.Throwable -> L6f
            boolean r3 = r3.zza(r4)     // Catch: java.security.GeneralSecurityException -> L68 java.lang.Throwable -> L6f
            if (r3 == 0) goto L60
            java.io.File r2 = r7.zzb()     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            boolean r3 = r2.exists()     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            if (r3 != 0) goto L30
            r2.mkdirs()     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
        L30:
            dalvik.system.DexClassLoader r3 = new dalvik.system.DexClassLoader     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            java.io.File r7 = r7.zzc()     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            r4 = 0
            android.content.Context r5 = r6.zzb     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            r3.<init>(r7, r2, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            java.lang.String r7 = "com.google.ccc.abuse.droidguard.DroidGuard"
            java.lang.Class r7 = r3.loadClass(r7)     // Catch: java.lang.IllegalArgumentException -> L53 java.lang.SecurityException -> L55 java.lang.ClassNotFoundException -> L57 java.lang.Throwable -> L6f
            r1.put(r0, r7)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r6)
            return r7
        L53:
            r7 = move-exception
            goto L58
        L55:
            r7 = move-exception
            goto L58
        L57:
            r7 = move-exception
        L58:
            com.google.android.gms.internal.ads.zzfsw r0 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Throwable -> L6f
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1, r7)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L60:
            com.google.android.gms.internal.ads.zzfsw r7 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.security.GeneralSecurityException -> L68 java.lang.Throwable -> L6f
            java.lang.String r0 = "VM did not pass signature verification"
            r7.<init>(r2, r0)     // Catch: java.security.GeneralSecurityException -> L68 java.lang.Throwable -> L6f
            throw r7     // Catch: java.security.GeneralSecurityException -> L68 java.lang.Throwable -> L6f
        L68:
            r7 = move-exception
            com.google.android.gms.internal.ads.zzfsw r0 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Throwable -> L6f
            r0.<init>(r2, r7)     // Catch: java.lang.Throwable -> L6f
            throw r0     // Catch: java.lang.Throwable -> L6f
        L6f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    public final com.google.android.gms.internal.ads.zzfrc zza() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfsm r1 = r2.zzf     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final com.google.android.gms.internal.ads.zzfsn zzb() {
            r2 = this;
            java.lang.Object r0 = r2.zzg
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfsm r1 = r2.zzf     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto Ld
            com.google.android.gms.internal.ads.zzfsn r1 = r1.zzf()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            r0 = 0
            return r0
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    public final boolean zzc(com.google.android.gms.internal.ads.zzfsn r13) {
            r12 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            java.lang.Class r3 = r12.zzd(r13)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r4 = 6
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> Lb3
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r2] = r6     // Catch: java.lang.Exception -> Lb3
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 1
            r5[r7] = r6     // Catch: java.lang.Exception -> Lb3
            java.lang.Class<byte[]> r6 = byte[].class
            r8 = 2
            r5[r8] = r6     // Catch: java.lang.Exception -> Lb3
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            r9 = 3
            r5[r9] = r6     // Catch: java.lang.Exception -> Lb3
            java.lang.Class<android.os.Bundle> r6 = android.os.Bundle.class
            r10 = 4
            r5[r10] = r6     // Catch: java.lang.Exception -> Lb3
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lb3
            r11 = 5
            r5[r11] = r6     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r5)     // Catch: java.lang.Exception -> Lb3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> Lb3
            android.content.Context r5 = r12.zzb     // Catch: java.lang.Exception -> Lb3
            r4[r2] = r5     // Catch: java.lang.Exception -> Lb3
            java.lang.String r5 = "msa-r"
            r4[r7] = r5     // Catch: java.lang.Exception -> Lb3
            byte[] r5 = r13.zze()     // Catch: java.lang.Exception -> Lb3
            r4[r8] = r5     // Catch: java.lang.Exception -> Lb3
            r5 = 0
            r4[r9] = r5     // Catch: java.lang.Exception -> Lb3
            android.os.Bundle r5 = new android.os.Bundle     // Catch: java.lang.Exception -> Lb3
            r5.<init>()     // Catch: java.lang.Exception -> Lb3
            r4[r10] = r5     // Catch: java.lang.Exception -> Lb3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lb3
            r4[r11] = r5     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Exception -> Lb3
            com.google.android.gms.internal.ads.zzfsm r4 = new com.google.android.gms.internal.ads.zzfsm     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            com.google.android.gms.internal.ads.zzfsy r5 = r12.zzc     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            com.google.android.gms.internal.ads.zzfqz r6 = r12.zzd     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r4.<init>(r3, r13, r5, r6)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            boolean r13 = r4.zzh()     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            if (r13 == 0) goto La9
            int r13 = r4.zze()     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            if (r13 != 0) goto L90
            java.lang.Object r13 = r12.zzg     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            monitor-enter(r13)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            com.google.android.gms.internal.ads.zzfsm r3 = r12.zzf     // Catch: java.lang.Throwable -> L8d
            if (r3 == 0) goto L7d
            r3.zzg()     // Catch: com.google.android.gms.internal.ads.zzfsw -> L71 java.lang.Throwable -> L8d
            goto L7d
        L71:
            r3 = move-exception
            com.google.android.gms.internal.ads.zzfqz r5 = r12.zzd     // Catch: java.lang.Throwable -> L8d
            int r6 = r3.zza()     // Catch: java.lang.Throwable -> L8d
            r8 = -1
            r5.zzc(r6, r8, r3)     // Catch: java.lang.Throwable -> L8d
        L7d:
            r12.zzf = r4     // Catch: java.lang.Throwable -> L8d
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzfqz r13 = r12.zzd     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            long r3 = r3 - r0
            r5 = 3000(0xbb8, float:4.204E-42)
            r13.zzd(r5, r3)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            return r7
        L8d:
            r3 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L8d
            throw r3     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
        L90:
            com.google.android.gms.internal.ads.zzfsw r3 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r4 = 4001(0xfa1, float:5.607E-42)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r5.<init>()     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            java.lang.String r6 = "ci: "
            r5.append(r6)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r5.append(r13)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            java.lang.String r13 = r5.toString()     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r3.<init>(r4, r13)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            throw r3     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
        La9:
            com.google.android.gms.internal.ads.zzfsw r13 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r3 = 4000(0xfa0, float:5.605E-42)
            java.lang.String r4 = "init failed"
            r13.<init>(r3, r4)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            throw r13     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
        Lb3:
            r13 = move-exception
            com.google.android.gms.internal.ads.zzfsw r3 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            r4 = 2004(0x7d4, float:2.808E-42)
            r3.<init>(r4, r13)     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
            throw r3     // Catch: java.lang.Exception -> Lbc com.google.android.gms.internal.ads.zzfsw -> Lca
        Lbc:
            r13 = move-exception
            com.google.android.gms.internal.ads.zzfqz r3 = r12.zzd
            r4 = 4010(0xfaa, float:5.619E-42)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r3.zzc(r4, r5, r13)
            goto Ld9
        Lca:
            r13 = move-exception
            com.google.android.gms.internal.ads.zzfqz r3 = r12.zzd
            int r4 = r13.zza()
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r0
            r3.zzc(r4, r5, r13)
        Ld9:
            return r2
    }
}
