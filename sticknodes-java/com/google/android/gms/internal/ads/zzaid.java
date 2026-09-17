package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaid extends com.google.android.gms.internal.ads.zzacp implements com.google.android.gms.internal.ads.zzaii {
    private final int zza;
    private final long zzb;

    public zzaid(long r9, long r11, int r13, int r14, boolean r15) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r5 = r13
            r6 = r14
            r0.<init>(r1, r3, r5, r6, r7)
            r8.zza = r13
            r11 = -1
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L12
            goto L13
        L12:
            r9 = r11
        L13:
            r8.zzb = r9
            return
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final int zzc() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zzd() {
            r2 = this;
            long r0 = r2.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzaii
    public final long zze(long r1) {
            r0 = this;
            long r1 = r0.zzb(r1)
            return r1
    }
}
