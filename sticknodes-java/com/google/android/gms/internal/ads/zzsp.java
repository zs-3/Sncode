package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzsp {
    private final java.util.HashSet zza;
    private android.media.LoudnessCodecController zzb;

    public zzsp() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public zzsp(com.google.android.gms.internal.ads.zzso r1) {
            r0 = this;
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.zza = r1
            return
    }

    public void zza(android.media.MediaCodec r2) {
            r1 = this;
            android.media.LoudnessCodecController r0 = r1.zzb
            if (r0 == 0) goto Lb
            boolean r0 = r0.addMediaCodec(r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.util.HashSet r0 = r1.zza
            boolean r2 = r0.add(r2)
            com.google.android.gms.internal.ads.zzdi.zzf(r2)
            return
    }

    public void zzb() {
            r1 = this;
            java.util.HashSet r0 = r1.zza
            r0.clear()
            android.media.LoudnessCodecController r0 = r1.zzb
            if (r0 == 0) goto Lc
            r0.close()
        Lc:
            return
    }

    public void zzc(android.media.MediaCodec r2) {
            r1 = this;
            java.util.HashSet r0 = r1.zza
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto Lf
            android.media.LoudnessCodecController r0 = r1.zzb
            if (r0 == 0) goto Lf
            r0.removeMediaCodec(r2)
        Lf:
            return
    }

    public void zzd(int r3) {
            r2 = this;
            android.media.LoudnessCodecController r0 = r2.zzb
            if (r0 == 0) goto La
            r0.close()
            r0 = 0
            r2.zzb = r0
        La:
            java.util.concurrent.Executor r0 = com.google.android.gms.internal.ads.zzggf.zzb()
            com.google.android.gms.internal.ads.zzsm r1 = new com.google.android.gms.internal.ads.zzsm
            r1.<init>(r2)
            android.media.LoudnessCodecController r3 = android.media.LoudnessCodecController.create(r3, r0, r1)
            r2.zzb = r3
            java.util.HashSet r0 = r2.zza
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            android.media.MediaCodec r1 = (android.media.MediaCodec) r1
            boolean r1 = r3.addMediaCodec(r1)
            if (r1 != 0) goto L1f
            r0.remove()
            goto L1f
        L35:
            return
    }
}
