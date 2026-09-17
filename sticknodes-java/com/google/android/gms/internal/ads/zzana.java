package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzana {
    private static final byte[] zzd = null;
    public int zza;
    public int zzb;
    public byte[] zzc;
    private boolean zze;

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1} // fill-array
            com.google.android.gms.internal.ads.zzana.zzd = r0
            return
    }

    public zzana(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r1]
            r0.zzc = r1
            return
    }

    public final void zza(byte[] r4, int r5, int r6) {
            r3 = this;
            boolean r0 = r3.zze
            if (r0 != 0) goto L5
            return
        L5:
            int r6 = r6 - r5
            byte[] r0 = r3.zzc
            int r1 = r0.length
            int r2 = r3.zza
            int r2 = r2 + r6
            if (r1 >= r2) goto L15
            int r2 = r2 + r2
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            r3.zzc = r0
        L15:
            byte[] r0 = r3.zzc
            int r1 = r3.zza
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.zza
            int r4 = r4 + r6
            r3.zza = r4
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 0
            r1.zze = r0
            r1.zza = r0
            r1.zzb = r0
            return
    }

    public final boolean zzc(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.zze
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            int r0 = r3.zza
            int r0 = r0 - r5
            r3.zza = r0
            int r5 = r3.zzb
            if (r5 != 0) goto L16
            r5 = 181(0xb5, float:2.54E-43)
            if (r4 != r5) goto L16
            r3.zzb = r0
            goto L1f
        L16:
            r3.zze = r2
            return r1
        L19:
            r5 = 179(0xb3, float:2.51E-43)
            if (r4 != r5) goto L1f
            r3.zze = r1
        L1f:
            byte[] r4 = com.google.android.gms.internal.ads.zzana.zzd
            r5 = 3
            r3.zza(r4, r2, r5)
            return r2
    }
}
