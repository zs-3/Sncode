package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
abstract class zzfyk extends com.google.android.gms.internal.ads.zzfxh {
    final java.lang.CharSequence zzb;
    int zzc;
    int zzd;

    protected zzfyk(com.google.android.gms.internal.ads.zzfym r1, java.lang.CharSequence r2) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zzc = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.zzd = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfxh
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
            r5 = this;
            int r0 = r5.zzc
        L2:
            int r1 = r5.zzc
            r2 = -1
            if (r1 == r2) goto L63
            int r1 = r5.zzd(r1)
            if (r1 != r2) goto L17
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            r5.zzc = r2
            r3 = -1
            goto L1d
        L17:
            int r3 = r5.zzc(r1)
            r5.zzc = r3
        L1d:
            if (r3 != r0) goto L2e
            int r3 = r3 + 1
            r5.zzc = r3
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            if (r3 <= r1) goto L2
            r5.zzc = r2
            goto L2
        L2e:
            if (r0 >= r1) goto L35
            java.lang.CharSequence r3 = r5.zzb
            r3.charAt(r0)
        L35:
            if (r0 >= r1) goto L3e
            java.lang.CharSequence r3 = r5.zzb
            int r4 = r1 + (-1)
            r3.charAt(r4)
        L3e:
            int r3 = r5.zzd
            r4 = 1
            if (r3 != r4) goto L55
            java.lang.CharSequence r1 = r5.zzb
            int r1 = r1.length()
            r5.zzc = r2
            if (r1 <= r0) goto L58
            java.lang.CharSequence r2 = r5.zzb
            int r3 = r1 + (-1)
            r2.charAt(r3)
            goto L58
        L55:
            int r3 = r3 + r2
            r5.zzd = r3
        L58:
            java.lang.CharSequence r2 = r5.zzb
            java.lang.CharSequence r0 = r2.subSequence(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L67
        L63:
            r5.zzb()
            r0 = 0
        L67:
            return r0
    }

    abstract int zzc(int r1);

    abstract int zzd(int r1);
}
