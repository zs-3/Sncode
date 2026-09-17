package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzta extends java.lang.Exception {
    public final java.lang.String zza;
    public final boolean zzb;
    public final com.google.android.gms.internal.ads.zzsw zzc;
    public final java.lang.String zzd;

    public zzta(com.google.android.gms.internal.ads.zzaf r11, java.lang.Throwable r12, boolean r13, int r14) {
            r10 = this;
            java.lang.String r13 = r11.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder init failed: ["
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r3 = r0.toString()
            java.lang.String r5 = r11.zzn
            int r11 = java.lang.Math.abs(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_"
            r13.append(r14)
            r13.append(r11)
            java.lang.String r8 = r13.toString()
            r6 = 0
            r7 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public zzta(com.google.android.gms.internal.ads.zzaf r11, java.lang.Throwable r12, boolean r13, com.google.android.gms.internal.ads.zzsw r14) {
            r10 = this;
            java.lang.String r13 = r14.zza
            java.lang.String r0 = r11.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Decoder init failed: "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = ", "
            r1.append(r13)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r5 = r11.zzn
            boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
            if (r11 == 0) goto L2d
            r11 = r12
            android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
            java.lang.String r11 = r11.getDiagnosticInfo()
            goto L2e
        L2d:
            r11 = 0
        L2e:
            r8 = r11
            r6 = 0
            r9 = 0
            r2 = r10
            r4 = r12
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private zzta(java.lang.String r1, java.lang.Throwable r2, java.lang.String r3, boolean r4, com.google.android.gms.internal.ads.zzsw r5, java.lang.String r6, com.google.android.gms.internal.ads.zzta r7) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.zza = r3
            r1 = 0
            r0.zzb = r1
            r0.zzc = r5
            r0.zzd = r6
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzta zza(com.google.android.gms.internal.ads.zzta r9, com.google.android.gms.internal.ads.zzta r10) {
            com.google.android.gms.internal.ads.zzsw r5 = r9.zzc
            java.lang.String r6 = r9.zzd
            com.google.android.gms.internal.ads.zzta r8 = new com.google.android.gms.internal.ads.zzta
            java.lang.String r1 = r9.getMessage()
            java.lang.Throwable r2 = r9.getCause()
            java.lang.String r3 = r9.zza
            r4 = 0
            r0 = r8
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
