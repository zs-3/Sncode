package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzads implements com.google.android.gms.internal.ads.zzaea {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzads(long[] r9, long[] r10, long r11) {
            r8 = this;
            r8.<init>()
            int r0 = r9.length
            int r1 = r10.length
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.gms.internal.ads.zzdi.zzd(r0)
            if (r1 <= 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r8.zzd = r0
            if (r0 == 0) goto L31
            r4 = r10[r3]
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L31
            int r0 = r1 + 1
            long[] r4 = new long[r0]
            r8.zza = r4
            long[] r0 = new long[r0]
            r8.zzb = r0
            java.lang.System.arraycopy(r9, r3, r4, r2, r1)
            java.lang.System.arraycopy(r10, r3, r0, r2, r1)
            goto L35
        L31:
            r8.zza = r9
            r8.zzb = r10
        L35:
            r8.zzc = r11
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final com.google.android.gms.internal.ads.zzady zzg(long r9) {
            r8 = this;
            boolean r0 = r8.zzd
            if (r0 != 0) goto Lc
            com.google.android.gms.internal.ads.zzady r9 = new com.google.android.gms.internal.ads.zzady
            com.google.android.gms.internal.ads.zzaeb r10 = com.google.android.gms.internal.ads.zzaeb.zza
            r9.<init>(r10, r10)
            return r9
        Lc:
            long[] r0 = r8.zzb
            r1 = 1
            int r0 = com.google.android.gms.internal.ads.zzeu.zzc(r0, r9, r1, r1)
            long[] r2 = r8.zzb
            com.google.android.gms.internal.ads.zzaeb r3 = new com.google.android.gms.internal.ads.zzaeb
            r4 = r2[r0]
            long[] r2 = r8.zza
            r6 = r2[r0]
            r3.<init>(r4, r6)
            long r4 = r3.zzb
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 == 0) goto L40
            long[] r9 = r8.zzb
            int r10 = r9.length
            int r10 = r10 + (-1)
            if (r0 != r10) goto L2e
            goto L40
        L2e:
            int r0 = r0 + r1
            com.google.android.gms.internal.ads.zzaeb r10 = new com.google.android.gms.internal.ads.zzaeb
            r1 = r9[r0]
            long[] r9 = r8.zza
            r4 = r9[r0]
            r10.<init>(r1, r4)
            com.google.android.gms.internal.ads.zzady r9 = new com.google.android.gms.internal.ads.zzady
            r9.<init>(r3, r10)
            return r9
        L40:
            com.google.android.gms.internal.ads.zzady r9 = new com.google.android.gms.internal.ads.zzady
            r9.<init>(r3, r3)
            return r9
    }

    @Override // com.google.android.gms.internal.ads.zzaea
    public final boolean zzh() {
            r1 = this;
            boolean r0 = r1.zzd
            return r0
    }
}
