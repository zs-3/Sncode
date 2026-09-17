package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxc extends com.google.android.gms.internal.ads.zzayc {
    private static final com.google.android.gms.internal.ads.zzayd zzh = null;
    private final com.google.android.gms.internal.ads.zzask zzi;
    private final android.content.Context zzj;

    static {
            com.google.android.gms.internal.ads.zzayd r0 = new com.google.android.gms.internal.ads.zzayd
            r0.<init>()
            com.google.android.gms.internal.ads.zzaxc.zzh = r0
            return
    }

    public zzaxc(com.google.android.gms.internal.ads.zzawo r9, java.lang.String r10, java.lang.String r11, com.google.android.gms.internal.ads.zzasm r12, int r13, int r14, android.content.Context r15, com.google.android.gms.internal.ads.zzasc r16, com.google.android.gms.internal.ads.zzask r17) {
            r8 = this;
            r7 = r8
            java.lang.String r2 = "5gR2Yi2k1qmqwB908rtZUebo4TzAbjEGSkWYIuNbRdnGPocO4kIxU9dsn2qP+c0J"
            java.lang.String r3 = "NnIoFyYmTm9Yd/i5F1TZFAo2tPeZkpFEZBtgPBr60Ow="
            r6 = 27
            r0 = r8
            r1 = r9
            r4 = r12
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r15
            r7.zzj = r0
            r0 = r17
            r7.zzi = r0
            return
    }

    private final java.lang.String zzc() {
            r2 = this;
            com.google.android.gms.internal.ads.zzawo r0 = r2.zza     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.Future r0 = r0.zzl()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L11
            com.google.android.gms.internal.ads.zzawo r0 = r2.zza     // Catch: java.lang.Throwable -> L24
            java.util.concurrent.Future r0 = r0.zzl()     // Catch: java.lang.Throwable -> L24
            r0.get()     // Catch: java.lang.Throwable -> L24
        L11:
            com.google.android.gms.internal.ads.zzawo r0 = r2.zza     // Catch: java.lang.Throwable -> L24
            com.google.android.gms.internal.ads.zzath r0 = r0.zzc()     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L24
            boolean r1 = r0.zzaj()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L24
            java.lang.String r0 = r0.zzh()     // Catch: java.lang.Throwable -> L24
            return r0
        L24:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r11 = this;
            com.google.android.gms.internal.ads.zzayd r0 = com.google.android.gms.internal.ads.zzaxc.zzh
            android.content.Context r1 = r11.zzj
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.zza(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzaty r1 = (com.google.android.gms.internal.ads.zzaty) r1     // Catch: java.lang.Throwable -> L10f
            if (r1 == 0) goto L31
            java.lang.String r2 = r1.zza     // Catch: java.lang.Throwable -> L10f
            boolean r2 = com.google.android.gms.internal.ads.zzawr.zzd(r2)     // Catch: java.lang.Throwable -> L10f
            if (r2 != 0) goto L31
            java.lang.String r2 = r1.zza     // Catch: java.lang.Throwable -> L10f
            java.lang.String r3 = "E"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L10f
            if (r2 != 0) goto L31
            java.lang.String r1 = r1.zza     // Catch: java.lang.Throwable -> L10f
            java.lang.String r2 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L10f
            if (r1 == 0) goto Ldb
        L31:
            r1 = 0
            boolean r2 = com.google.android.gms.internal.ads.zzawr.zzd(r1)     // Catch: java.lang.Throwable -> L10f
            r3 = 3
            if (r2 != 0) goto L3b
            r2 = 5
            goto L4a
        L3b:
            boolean r2 = com.google.android.gms.internal.ads.zzawr.zzd(r1)     // Catch: java.lang.Throwable -> L10f
            if (r2 != 0) goto L44
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L10f
            goto L46
        L44:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L10f
        L46:
            r2.booleanValue()     // Catch: java.lang.Throwable -> L10f
            r2 = 3
        L4a:
            r4 = 1
            r5 = 0
            if (r2 != r3) goto L58
            com.google.android.gms.internal.ads.zzask r6 = r11.zzi     // Catch: java.lang.Throwable -> L10f
            boolean r6 = r6.zzd()     // Catch: java.lang.Throwable -> L10f
            if (r6 != 0) goto L58
            r6 = 1
            goto L59
        L58:
            r6 = 0
        L59:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzbcm r7 = com.google.android.gms.internal.ads.zzbcv.zzcx     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzbct r8 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r7 = r8.zza(r7)     // Catch: java.lang.Throwable -> L10f
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzbcm r8 = com.google.android.gms.internal.ads.zzbcv.zzcw     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzbct r9 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r8 = r9.zza(r8)     // Catch: java.lang.Throwable -> L10f
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L10f
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L10f
            if (r8 == 0) goto L80
            java.lang.String r8 = r11.zzb()     // Catch: java.lang.Throwable -> L10f
            goto L81
        L80:
            r8 = r1
        L81:
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L10f
            if (r7 == 0) goto L99
            com.google.android.gms.internal.ads.zzawo r7 = r11.zza     // Catch: java.lang.Throwable -> L10f
            boolean r7 = r7.zzp()     // Catch: java.lang.Throwable -> L10f
            if (r7 == 0) goto L99
            boolean r7 = com.google.android.gms.internal.ads.zzawr.zzd(r8)     // Catch: java.lang.Throwable -> L10f
            if (r7 == 0) goto L99
            java.lang.String r8 = r11.zzc()     // Catch: java.lang.Throwable -> L10f
        L99:
            java.lang.reflect.Method r7 = r11.zze     // Catch: java.lang.Throwable -> L10f
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L10f
            android.content.Context r10 = r11.zzj     // Catch: java.lang.Throwable -> L10f
            r9[r5] = r10     // Catch: java.lang.Throwable -> L10f
            r9[r4] = r6     // Catch: java.lang.Throwable -> L10f
            r4 = 2
            r9[r4] = r8     // Catch: java.lang.Throwable -> L10f
            java.lang.Object r4 = r7.invoke(r1, r9)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzaty r5 = new com.google.android.gms.internal.ads.zzaty     // Catch: java.lang.Throwable -> L10f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L10f
            java.lang.String r4 = r5.zza     // Catch: java.lang.Throwable -> L10f
            boolean r4 = com.google.android.gms.internal.ads.zzawr.zzd(r4)     // Catch: java.lang.Throwable -> L10f
            if (r4 != 0) goto Lc3
            java.lang.String r4 = r5.zza     // Catch: java.lang.Throwable -> L10f
            java.lang.String r6 = "E"
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L10f
            if (r4 == 0) goto Ld8
        Lc3:
            int r2 = r2 + (-1)
            if (r2 == r3) goto Lcc
            r3 = 4
            if (r2 == r3) goto Lcb
            goto Ld8
        Lcb:
            throw r1     // Catch: java.lang.Throwable -> L10f
        Lcc:
            java.lang.String r1 = r11.zzc()     // Catch: java.lang.Throwable -> L10f
            boolean r2 = com.google.android.gms.internal.ads.zzawr.zzd(r1)     // Catch: java.lang.Throwable -> L10f
            if (r2 != 0) goto Ld8
            r5.zza = r1     // Catch: java.lang.Throwable -> L10f
        Ld8:
            r0.set(r5)     // Catch: java.lang.Throwable -> L10f
        Ldb:
            java.lang.Object r1 = r0.get()     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzaty r1 = (com.google.android.gms.internal.ads.zzaty) r1     // Catch: java.lang.Throwable -> L10f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10f
            com.google.android.gms.internal.ads.zzasm r2 = r11.zzd
            monitor-enter(r2)
            if (r1 == 0) goto L10a
            com.google.android.gms.internal.ads.zzasm r0 = r11.zzd     // Catch: java.lang.Throwable -> L10c
            java.lang.String r3 = r1.zza     // Catch: java.lang.Throwable -> L10c
            r0.zzx(r3)     // Catch: java.lang.Throwable -> L10c
            com.google.android.gms.internal.ads.zzasm r0 = r11.zzd     // Catch: java.lang.Throwable -> L10c
            long r3 = r1.zzb     // Catch: java.lang.Throwable -> L10c
            r0.zzX(r3)     // Catch: java.lang.Throwable -> L10c
            com.google.android.gms.internal.ads.zzasm r0 = r11.zzd     // Catch: java.lang.Throwable -> L10c
            java.lang.String r3 = r1.zzc     // Catch: java.lang.Throwable -> L10c
            r0.zzZ(r3)     // Catch: java.lang.Throwable -> L10c
            com.google.android.gms.internal.ads.zzasm r0 = r11.zzd     // Catch: java.lang.Throwable -> L10c
            java.lang.String r3 = r1.zzd     // Catch: java.lang.Throwable -> L10c
            r0.zzi(r3)     // Catch: java.lang.Throwable -> L10c
            com.google.android.gms.internal.ads.zzasm r0 = r11.zzd     // Catch: java.lang.Throwable -> L10c
            java.lang.String r1 = r1.zze     // Catch: java.lang.Throwable -> L10c
            r0.zzw(r1)     // Catch: java.lang.Throwable -> L10c
        L10a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10c
            return
        L10c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10c
            throw r0
        L10f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10f
            throw r1
    }

    protected final java.lang.String zzb() {
            r9 = this;
            r0 = 0
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcy     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L84
            byte[] r2 = com.google.android.gms.internal.ads.zzawr.zzf(r2)     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r7.<init>()     // Catch: java.lang.Throwable -> L84
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L84
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L84
            java.security.cert.Certificate r2 = r1.generateCertificate(r3)     // Catch: java.lang.Throwable -> L84
            r7.add(r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = android.os.Build.TYPE     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "user"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L4e
            com.google.android.gms.internal.ads.zzbcm r2 = com.google.android.gms.internal.ads.zzbcv.zzcz     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.internal.ads.zzbct r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L84
            byte[] r2 = com.google.android.gms.internal.ads.zzawr.zzf(r2)     // Catch: java.lang.Throwable -> L84
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L84
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L84
            java.security.cert.Certificate r1 = r1.generateCertificate(r3)     // Catch: java.lang.Throwable -> L84
            r7.add(r1)     // Catch: java.lang.Throwable -> L84
        L4e:
            android.content.Context r1 = r9.zzj     // Catch: java.lang.Throwable -> L84
            java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.Throwable -> L84
            com.google.android.gms.internal.ads.zzawo r2 = r9.zza     // Catch: java.lang.Throwable -> L84
            r2.zzk()     // Catch: java.lang.Throwable -> L84
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L84
            r3 = 30
            if (r2 > r3) goto L6a
            java.lang.String r2 = android.os.Build.VERSION.CODENAME     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L84
            if (r2 != 0) goto L6a
            goto L84
        L6a:
            com.google.android.gms.internal.ads.zzggh r2 = com.google.android.gms.internal.ads.zzggh.zze()     // Catch: java.lang.Throwable -> L84
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L84
            r5 = 0
            r6 = 8
            com.google.android.gms.internal.ads.zzaye r8 = new com.google.android.gms.internal.ads.zzaye     // Catch: java.lang.Throwable -> L84
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L84
            r3.requestChecksums(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r2.get()     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L84
            r0 = r1
        L84:
            return r0
    }
}
