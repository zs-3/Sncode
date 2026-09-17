package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfsm implements com.google.android.gms.internal.ads.zzfrc {
    private final java.lang.Object zza;
    private final com.google.android.gms.internal.ads.zzfsn zzb;
    private final com.google.android.gms.internal.ads.zzfsy zzc;
    private final com.google.android.gms.internal.ads.zzfqz zzd;

    zzfsm(java.lang.Object r1, com.google.android.gms.internal.ads.zzfsn r2, com.google.android.gms.internal.ads.zzfsy r3, com.google.android.gms.internal.ads.zzfqz r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    private static java.lang.String zzi(byte[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.google.android.gms.internal.ads.zzatt r0 = com.google.android.gms.internal.ads.zzatu.zza()
            r1 = 5
            r0.zzc(r1)
            r1 = 0
            int r2 = r3.length
            com.google.android.gms.internal.ads.zzgzs r3 = com.google.android.gms.internal.ads.zzgzs.zzv(r3, r1, r2)
            r0.zza(r3)
            com.google.android.gms.internal.ads.zzhbe r3 = r0.zzbn()
            com.google.android.gms.internal.ads.zzatu r3 = (com.google.android.gms.internal.ads.zzatu) r3
            byte[] r3 = r3.zzaV()
            r0 = 11
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            return r3
    }

    private final synchronized byte[] zzj(java.util.Map r10, java.util.Map r11) {
            r9 = this;
            monitor-enter(r9)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            r10 = 0
            java.lang.Object r2 = r9.zza     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.String r3 = "xss"
            r4 = 2
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r7 = 0
            r5[r7] = r6     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r8 = 1
            r5[r8] = r6     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.Object r3 = r9.zza     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            r4[r7] = r10     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            r4[r8] = r11     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            java.lang.Object r11 = r2.invoke(r3, r4)     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            byte[] r11 = (byte[]) r11     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L3e
            monitor-exit(r9)
            return r11
        L2f:
            r11 = move-exception
            com.google.android.gms.internal.ads.zzfqz r2 = r9.zzd     // Catch: java.lang.Throwable -> L3e
            r3 = 2007(0x7d7, float:2.812E-42)
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            long r4 = r4 - r0
            r2.zzc(r3, r4, r11)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r9)
            return r10
        L3e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final synchronized java.lang.String zza(android.content.Context r3, java.lang.String r4, java.lang.String r5, android.view.View r6, android.app.Activity r7) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfsy r4 = r2.zzc     // Catch: java.lang.Throwable -> L32
            java.util.Map r4 = r4.zza()     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "f"
            java.lang.String r1 = "c"
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "ctx"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "cs"
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "aid"
            r5 = 0
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "view"
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "act"
            r4.put(r3, r7)     // Catch: java.lang.Throwable -> L32
            byte[] r3 = r2.zzj(r5, r4)     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = zzi(r3)     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            return r3
        L32:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final synchronized java.lang.String zzb(android.content.Context r3, java.lang.String r4, android.view.View r5, android.app.Activity r6) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfsy r4 = r2.zzc     // Catch: java.lang.Throwable -> L2d
            java.util.Map r4 = r4.zzc()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "f"
            java.lang.String r1 = "v"
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "ctx"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "aid"
            r0 = 0
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "view"
            r4.put(r3, r5)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "act"
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L2d
            byte[] r3 = r2.zzj(r0, r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = zzi(r3)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            return r3
        L2d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final synchronized java.lang.String zzc(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzfsy r4 = r2.zzc     // Catch: java.lang.Throwable -> L23
            java.util.Map r4 = r4.zzb()     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "f"
            java.lang.String r1 = "q"
            r4.put(r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = "ctx"
            r4.put(r0, r3)     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = "aid"
            r0 = 0
            r4.put(r3, r0)     // Catch: java.lang.Throwable -> L23
            byte[] r3 = r2.zzj(r0, r4)     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = zzi(r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return r3
        L23:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
    }

    @Override // com.google.android.gms.internal.ads.zzfrc
    public final synchronized void zzd(java.lang.String r8, android.view.MotionEvent r9) throws com.google.android.gms.internal.ads.zzfsw {
            r7 = this;
            monitor-enter(r7)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.util.HashMap r8 = new java.util.HashMap     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r8.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r2 = "t"
            java.lang.Throwable r3 = new java.lang.Throwable     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r2 = "aid"
            r3 = 0
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r2 = "evt"
            r8.put(r2, r9)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.Object r9 = r7.zza     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.Class r9 = r9.getClass()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.String r2 = "he"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.reflect.Method r9 = r9.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.Object r2 = r7.zza     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r3[r6] = r8     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            r9.invoke(r2, r3)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            com.google.android.gms.internal.ads.zzfqz r8 = r7.zzd     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            long r2 = r2 - r0
            r9 = 3003(0xbbb, float:4.208E-42)
            r8.zzd(r9, r2)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4c
            monitor-exit(r7)
            return
        L4a:
            r8 = move-exception
            goto L55
        L4c:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzfsw r9 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Throwable -> L4a
            r0 = 2005(0x7d5, float:2.81E-42)
            r9.<init>(r0, r8)     // Catch: java.lang.Throwable -> L4a
            throw r9     // Catch: java.lang.Throwable -> L4a
        L55:
            monitor-exit(r7)
            throw r8
    }

    public final synchronized int zze() throws com.google.android.gms.internal.ads.zzfsw {
            r4 = this;
            monitor-enter(r4)
            java.lang.Object r0 = r4.zza     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.String r1 = "lcs"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object r1 = r4.zza     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            monitor-exit(r4)
            return r0
        L20:
            r0 = move-exception
            goto L2b
        L22:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfsw r1 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Throwable -> L20
            r2 = 2006(0x7d6, float:2.811E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L2b:
            monitor-exit(r4)
            throw r0
    }

    final com.google.android.gms.internal.ads.zzfsn zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfsn r0 = r1.zzb
            return r0
    }

    public final synchronized void zzg() throws com.google.android.gms.internal.ads.zzfsw {
            r6 = this;
            monitor-enter(r6)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.Object r2 = r6.zza     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.String r3 = "close"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.Object r3 = r6.zza     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r2.invoke(r3, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            com.google.android.gms.internal.ads.zzfqz r2 = r6.zzd     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            long r3 = r3 - r0
            r0 = 3001(0xbb9, float:4.205E-42)
            r2.zzd(r0, r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            monitor-exit(r6)
            return
        L29:
            r0 = move-exception
            goto L34
        L2b:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfsw r1 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Throwable -> L29
            r2 = 2003(0x7d3, float:2.807E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L29
            throw r1     // Catch: java.lang.Throwable -> L29
        L34:
            monitor-exit(r6)
            throw r0
    }

    final synchronized boolean zzh() throws com.google.android.gms.internal.ads.zzfsw {
            r4 = this;
            monitor-enter(r4)
            java.lang.Object r0 = r4.zza     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.String r1 = "init"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object r1 = r4.zza     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L22
            monitor-exit(r4)
            return r0
        L20:
            r0 = move-exception
            goto L2b
        L22:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzfsw r1 = new com.google.android.gms.internal.ads.zzfsw     // Catch: java.lang.Throwable -> L20
            r2 = 2001(0x7d1, float:2.804E-42)
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        L2b:
            monitor-exit(r4)
            throw r0
    }
}
