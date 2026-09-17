package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanr {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzanr(int r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.zzc = r2
            r2 = 131(0x83, float:1.84E-43)
            byte[] r2 = new byte[r2]
            r1.zza = r2
            r3 = 2
            r0 = 1
            r2[r3] = r0
            return
    }

    public final void zza(byte[] r4, int r5, int r6) {
            r3 = this;
            boolean r0 = r3.zzd
            if (r0 != 0) goto L5
            return
        L5:
            int r6 = r6 - r5
            byte[] r0 = r3.zza
            int r1 = r0.length
            int r2 = r3.zzb
            int r2 = r2 + r6
            if (r1 >= r2) goto L15
            int r2 = r2 + r2
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)
            r3.zza = r0
        L15:
            byte[] r0 = r3.zza
            int r1 = r3.zzb
            java.lang.System.arraycopy(r4, r5, r0, r1, r6)
            int r4 = r3.zzb
            int r4 = r4 + r6
            r3.zzb = r4
            return
    }

    public final void zzb() {
            r1 = this;
            r0 = 0
            r1.zzd = r0
            r1.zze = r0
            return
    }

    public final void zzc(int r4) {
            r3 = this;
            boolean r0 = r3.zzd
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            int r0 = r3.zzc
            r2 = 0
            if (r4 != r0) goto Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            r3.zzd = r1
            if (r1 == 0) goto L17
            r4 = 3
            r3.zzb = r4
            r3.zze = r2
        L17:
            return
    }

    public final boolean zzd(int r3) {
            r2 = this;
            boolean r0 = r2.zzd
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r2.zzb
            int r0 = r0 - r3
            r2.zzb = r0
            r2.zzd = r1
            r3 = 1
            r2.zze = r3
            return r3
    }

    public final boolean zze() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }
}
