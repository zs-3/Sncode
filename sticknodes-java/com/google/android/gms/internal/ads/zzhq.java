package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public class zzhq extends com.google.android.gms.internal.ads.zzhk {
    public com.google.android.gms.internal.ads.zzaf zza;
    public final com.google.android.gms.internal.ads.zzhn zzb;
    public java.nio.ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public java.nio.ByteBuffer zzf;
    private final int zzg;

    static {
            java.lang.String r0 = "media3.decoder"
            com.google.android.gms.internal.ads.zzbd.zzb(r0)
            return
    }

    public zzhq(int r1, int r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.internal.ads.zzhn r2 = new com.google.android.gms.internal.ads.zzhn
            r2.<init>()
            r0.zzb = r2
            r0.zzg = r1
            return
    }

    private final java.nio.ByteBuffer zzm(int r3) {
            r2 = this;
            int r0 = r2.zzg
            r1 = 1
            if (r0 != r1) goto La
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            return r3
        La:
            r1 = 2
            if (r0 != r1) goto L12
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
            return r3
        L12:
            java.nio.ByteBuffer r0 = r2.zzc
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            int r0 = r0.capacity()
        L1c:
            com.google.android.gms.internal.ads.zzhp r1 = new com.google.android.gms.internal.ads.zzhp
            r1.<init>(r0, r3)
            throw r1
    }

    @Override // com.google.android.gms.internal.ads.zzhk
    public void zzb() {
            r1 = this;
            super.zzb()
            java.nio.ByteBuffer r0 = r1.zzc
            if (r0 == 0) goto La
            r0.clear()
        La:
            java.nio.ByteBuffer r0 = r1.zzf
            if (r0 == 0) goto L11
            r0.clear()
        L11:
            r0 = 0
            r1.zzd = r0
            return
    }

    public final void zzj(int r4) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.zzc
            if (r0 != 0) goto Lb
            java.nio.ByteBuffer r4 = r3.zzm(r4)
            r3.zzc = r4
            return
        Lb:
            int r1 = r0.capacity()
            int r2 = r0.position()
            int r4 = r4 + r2
            if (r1 < r4) goto L19
            r3.zzc = r0
            return
        L19:
            java.nio.ByteBuffer r4 = r3.zzm(r4)
            java.nio.ByteOrder r1 = r0.order()
            r4.order(r1)
            if (r2 <= 0) goto L2c
            r0.flip()
            r4.put(r0)
        L2c:
            r3.zzc = r4
            return
    }

    public final void zzk() {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.zzc
            if (r0 == 0) goto L7
            r0.flip()
        L7:
            java.nio.ByteBuffer r0 = r1.zzf
            if (r0 == 0) goto Le
            r0.flip()
        Le:
            return
    }

    public final boolean zzl() {
            r1 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r1.zzd(r0)
            return r0
    }
}
