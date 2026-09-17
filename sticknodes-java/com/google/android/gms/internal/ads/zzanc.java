package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzanc {
    private static final byte[] zzd = null;
    public int zza;
    public int zzb;
    public byte[] zzc;
    private boolean zze;
    private int zzf;

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [0, 0, 1} // fill-array
            com.google.android.gms.internal.ads.zzanc.zzd = r0
            return
    }

    public zzanc(int r1) {
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
            r1.zzf = r0
            return
    }

    public final boolean zzc(int r9, int r10) {
            r8 = this;
            int r0 = r8.zzf
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L51
            r4 = 181(0xb5, float:2.54E-43)
            r5 = 2
            java.lang.String r6 = "Unexpected start code value"
            java.lang.String r7 = "H263Reader"
            if (r0 == r3) goto L45
            if (r0 == r5) goto L37
            if (r0 == r2) goto L22
            r0 = 179(0xb3, float:2.51E-43)
            if (r9 == r0) goto L1a
            if (r9 != r4) goto L59
        L1a:
            int r9 = r8.zza
            int r9 = r9 - r10
            r8.zza = r9
            r8.zze = r1
            return r3
        L22:
            r9 = r9 & 240(0xf0, float:3.36E-43)
            r10 = 32
            if (r9 == r10) goto L2f
            com.google.android.gms.internal.ads.zzea.zzf(r7, r6)
            r8.zzb()
            goto L59
        L2f:
            int r9 = r8.zza
            r8.zzb = r9
            r9 = 4
            r8.zzf = r9
            goto L59
        L37:
            r10 = 31
            if (r9 <= r10) goto L42
            com.google.android.gms.internal.ads.zzea.zzf(r7, r6)
            r8.zzb()
            goto L59
        L42:
            r8.zzf = r2
            goto L59
        L45:
            if (r9 == r4) goto L4e
            com.google.android.gms.internal.ads.zzea.zzf(r7, r6)
            r8.zzb()
            goto L59
        L4e:
            r8.zzf = r5
            goto L59
        L51:
            r10 = 176(0xb0, float:2.47E-43)
            if (r9 != r10) goto L59
            r8.zzf = r3
            r8.zze = r3
        L59:
            byte[] r9 = com.google.android.gms.internal.ads.zzanc.zzd
            r8.zza(r9, r1, r2)
            return r1
    }
}
