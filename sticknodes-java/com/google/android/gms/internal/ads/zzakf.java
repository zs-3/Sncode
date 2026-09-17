package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzakf extends com.google.android.gms.internal.ads.zzakj {
    private static final byte[] zza = null;
    private static final byte[] zzb = null;
    private boolean zzc;

    static {
            r0 = 8
            byte[] r1 = new byte[r0]
            r1 = {x0012: FILL_ARRAY_DATA , data: [79, 112, 117, 115, 72, 101, 97, 100} // fill-array
            com.google.android.gms.internal.ads.zzakf.zza = r1
            byte[] r0 = new byte[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [79, 112, 117, 115, 84, 97, 103, 115} // fill-array
            com.google.android.gms.internal.ads.zzakf.zzb = r0
            return
    }

    zzakf() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean zzd(com.google.android.gms.internal.ads.zzek r1) {
            byte[] r0 = com.google.android.gms.internal.ads.zzakf.zza
            boolean r1 = zzk(r1, r0)
            return r1
    }

    private static boolean zzk(com.google.android.gms.internal.ads.zzek r4, byte[] r5) {
            int r0 = r4.zzb()
            r1 = 0
            r2 = 8
            if (r0 >= r2) goto La
            return r1
        La:
            int r0 = r4.zzd()
            byte[] r3 = new byte[r2]
            r4.zzH(r3, r1, r2)
            r4.zzL(r0)
            boolean r4 = java.util.Arrays.equals(r3, r5)
            return r4
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final long zza(com.google.android.gms.internal.ads.zzek r3) {
            r2 = this;
            byte[] r3 = r3.zzN()
            long r0 = com.google.android.gms.internal.ads.zzadw.zzd(r3)
            long r0 = r2.zzg(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final void zzb(boolean r1) {
            r0 = this;
            super.zzb(r1)
            if (r1 == 0) goto L8
            r1 = 0
            r0.zzc = r1
        L8:
            return
    }

    @Override // com.google.android.gms.internal.ads.zzakj
    protected final boolean zzc(com.google.android.gms.internal.ads.zzek r3, long r4, com.google.android.gms.internal.ads.zzakg r6) throws com.google.android.gms.internal.ads.zzbo {
            r2 = this;
            byte[] r4 = com.google.android.gms.internal.ads.zzakf.zza
            boolean r4 = zzk(r3, r4)
            r5 = 1
            if (r4 == 0) goto L41
            byte[] r4 = r3.zzN()
            int r3 = r3.zze()
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r4 = 9
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.util.List r3 = com.google.android.gms.internal.ads.zzadw.zze(r3)
            com.google.android.gms.internal.ads.zzaf r0 = r6.zza
            if (r0 == 0) goto L24
            goto L81
        L24:
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            java.lang.String r1 = "audio/opus"
            r0.zzZ(r1)
            r0.zzz(r4)
            r4 = 48000(0xbb80, float:6.7262E-41)
            r0.zzaa(r4)
            r0.zzM(r3)
            com.google.android.gms.internal.ads.zzaf r3 = r0.zzaf()
            r6.zza = r3
            return r5
        L41:
            byte[] r4 = com.google.android.gms.internal.ads.zzakf.zzb
            boolean r4 = zzk(r3, r4)
            r0 = 0
            if (r4 == 0) goto L82
            com.google.android.gms.internal.ads.zzaf r4 = r6.zza
            com.google.android.gms.internal.ads.zzdi.zzb(r4)
            boolean r4 = r2.zzc
            if (r4 != 0) goto L81
            r2.zzc = r5
            r4 = 8
            r3.zzM(r4)
            com.google.android.gms.internal.ads.zzaek r3 = com.google.android.gms.internal.ads.zzaen.zzc(r3, r0, r0)
            java.lang.String[] r3 = r3.zza
            com.google.android.gms.internal.ads.zzgax r3 = com.google.android.gms.internal.ads.zzgax.zzm(r3)
            com.google.android.gms.internal.ads.zzbk r3 = com.google.android.gms.internal.ads.zzaen.zzb(r3)
            if (r3 == 0) goto L81
            com.google.android.gms.internal.ads.zzaf r4 = r6.zza
            com.google.android.gms.internal.ads.zzad r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzaf r0 = r6.zza
            com.google.android.gms.internal.ads.zzbk r0 = r0.zzk
            com.google.android.gms.internal.ads.zzbk r3 = r3.zzd(r0)
            r4.zzS(r3)
            com.google.android.gms.internal.ads.zzaf r3 = r4.zzaf()
            r6.zza = r3
        L81:
            return r5
        L82:
            com.google.android.gms.internal.ads.zzaf r3 = r6.zza
            com.google.android.gms.internal.ads.zzdi.zzb(r3)
            return r0
    }
}
