package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzepw implements com.google.android.gms.internal.ads.zzexh {
    private final com.google.android.gms.internal.ads.zzexh zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.internal.ads.zzcad zzd;

    public zzepw(com.google.android.gms.internal.ads.zzerx r1, com.google.android.gms.internal.ads.zzfhc r2, android.content.Context r3, com.google.android.gms.internal.ads.zzcad r4) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            r0.zzd = r4
            return
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
            r1 = this;
            r0 = 7
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
            r3 = this;
            com.google.android.gms.internal.ads.zzexh r0 = r3.zza
            com.google.common.util.concurrent.ListenableFuture r0 = r0.zzb()
            com.google.android.gms.internal.ads.zzepv r1 = new com.google.android.gms.internal.ads.zzepv
            r1.<init>(r3)
            com.google.android.gms.internal.ads.zzgfz r2 = com.google.android.gms.internal.ads.zzcan.zzf
            com.google.common.util.concurrent.ListenableFuture r0 = com.google.android.gms.internal.ads.zzgfo.zzm(r0, r1, r2)
            return r0
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzepx zzc(com.google.android.gms.internal.ads.zzexq r17) {
            r16 = this;
            r0 = r16
            com.google.android.gms.internal.ads.zzfhc r1 = r0.zzb
            com.google.android.gms.ads.internal.client.zzs r3 = r1.zze
            com.google.android.gms.ads.internal.client.zzs[] r1 = r3.zzg
            r2 = 0
            if (r1 != 0) goto L12
            java.lang.String r1 = r3.zza
            boolean r6 = r3.zzi
            r9 = r1
            r10 = r6
            goto L34
        L12:
            r9 = r2
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
        L17:
            int r11 = r1.length
            if (r6 >= r11) goto L34
            r11 = r1[r6]
            boolean r12 = r11.zzi
            if (r12 != 0) goto L25
            if (r7 != 0) goto L25
            java.lang.String r9 = r11.zza
            r7 = 1
        L25:
            if (r12 == 0) goto L2d
            if (r8 != 0) goto L2c
            r8 = 1
            r10 = 1
            goto L2d
        L2c:
            r8 = 1
        L2d:
            if (r7 == 0) goto L31
            if (r8 != 0) goto L34
        L31:
            int r6 = r6 + 1
            goto L17
        L34:
            android.content.Context r1 = r0.zzc
            android.content.res.Resources r1 = r1.getResources()
            r6 = 0
            if (r1 == 0) goto L55
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            if (r1 == 0) goto L55
            com.google.android.gms.internal.ads.zzcad r2 = r0.zzd
            float r7 = r1.density
            int r8 = r1.widthPixels
            int r1 = r1.heightPixels
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()
            java.lang.String r2 = r2.zzm()
            r11 = r2
            goto L59
        L55:
            r11 = r2
            r1 = 0
            r7 = 0
            r8 = 0
        L59:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.client.zzs[] r12 = r3.zzg
            if (r12 == 0) goto Lbb
            r13 = 0
            r14 = 0
        L64:
            int r15 = r12.length
            java.lang.String r4 = "|"
            if (r13 >= r15) goto La8
            r15 = r12[r13]
            boolean r5 = r15.zzi
            if (r5 == 0) goto L71
            r14 = 1
            goto La5
        L71:
            int r5 = r2.length()
            if (r5 == 0) goto L7a
            r2.append(r4)
        L7a:
            int r4 = r15.zze
            r5 = -1
            if (r4 != r5) goto L8a
            int r4 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r4 == 0) goto L89
            int r4 = r15.zzf
            float r4 = (float) r4
            float r4 = r4 / r7
            int r4 = (int) r4
            goto L8a
        L89:
            r4 = -1
        L8a:
            r2.append(r4)
            java.lang.String r4 = "x"
            r2.append(r4)
            int r4 = r15.zzb
            r5 = -2
            if (r4 != r5) goto La2
            int r4 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r4 == 0) goto La1
            int r4 = r15.zzc
            float r4 = (float) r4
            float r4 = r4 / r7
            int r4 = (int) r4
            goto La2
        La1:
            r4 = -2
        La2:
            r2.append(r4)
        La5:
            int r13 = r13 + 1
            goto L64
        La8:
            if (r14 == 0) goto Lbb
            int r5 = r2.length()
            if (r5 == 0) goto Lb5
            r5 = 0
            r2.insert(r5, r4)
            goto Lb6
        Lb5:
            r5 = 0
        Lb6:
            java.lang.String r4 = "320x50"
            r2.insert(r5, r4)
        Lbb:
            java.lang.String r6 = r2.toString()
            com.google.android.gms.internal.ads.zzfhc r2 = r0.zzb
            boolean r12 = r2.zzq
            com.google.android.gms.internal.ads.zzepx r13 = new com.google.android.gms.internal.ads.zzepx
            r2 = r13
            r4 = r9
            r5 = r10
            r9 = r1
            r10 = r11
            r11 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }
}
