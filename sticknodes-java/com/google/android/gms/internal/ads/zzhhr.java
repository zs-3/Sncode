package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public abstract class zzhhr extends com.google.android.gms.internal.ads.zzhhp {
    private int zzg;

    protected zzhhr(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = "mvhd"
            r0.<init>(r1)
            return
    }

    public final int zzg() {
            r1 = this;
            boolean r0 = r1.zzb
            if (r0 != 0) goto L7
            r1.zzf()
        L7:
            int r0 = r1.zzg
            return r0
    }

    protected final long zzh(java.nio.ByteBuffer r3) {
            r2 = this;
            byte r0 = r3.get()
            int r0 = com.google.android.gms.internal.ads.zzaro.zzc(r0)
            r2.zzg = r0
            com.google.android.gms.internal.ads.zzaro.zzd(r3)
            r3.get()
            r0 = 4
            return r0
    }
}
