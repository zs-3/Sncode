package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzsv extends com.google.android.gms.internal.ads.zzho {
    public final java.lang.String zza;
    public final int zzb;

    public zzsv(java.lang.Throwable r4, com.google.android.gms.internal.ads.zzsw r5) {
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L5
            r5 = r0
            goto L7
        L5:
            java.lang.String r5 = r5.zza
        L7:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "Decoder failed: "
            java.lang.String r5 = r1.concat(r5)
            r3.<init>(r5, r4)
            boolean r5 = r4 instanceof android.media.MediaCodec.CodecException
            if (r5 == 0) goto L1f
            r0 = r4
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r0 = r0.getDiagnosticInfo()
        L1f:
            r3.zza = r0
            int r1 = com.google.android.gms.internal.ads.zzeu.zza
            r2 = 23
            if (r1 < r2) goto L32
            if (r5 == 0) goto L30
            android.media.MediaCodec$CodecException r4 = (android.media.MediaCodec.CodecException) r4
            int r4 = r4.getErrorCode()
            goto L36
        L30:
            r4 = 0
            goto L36
        L32:
            int r4 = com.google.android.gms.internal.ads.zzeu.zzl(r0)
        L36:
            r3.zzb = r4
            return
    }
}
