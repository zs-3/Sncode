package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
final class zzfyf extends com.google.android.gms.internal.ads.zzfyk {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfyg zza;

    zzfyf(com.google.android.gms.internal.ads.zzfyg r1, com.google.android.gms.internal.ads.zzfym r2, java.lang.CharSequence r3) {
            r0 = this;
            r0.zza = r1
            r0.<init>(r2, r3)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    final int zzc(int r1) {
            r0 = this;
            int r1 = r1 + 1
            return r1
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    final int zzd(int r5) {
            r4 = this;
            java.lang.CharSequence r0 = r4.zzb
            int r1 = r0.length()
            java.lang.String r2 = "index"
            com.google.android.gms.internal.ads.zzfxz.zzb(r5, r1, r2)
        Lb:
            if (r5 >= r1) goto L1f
            com.google.android.gms.internal.ads.zzfyg r2 = r4.zza
            char r3 = r0.charAt(r5)
            com.google.android.gms.internal.ads.zzfxn r2 = r2.zza
            boolean r2 = r2.zzb(r3)
            if (r2 == 0) goto L1c
            goto L20
        L1c:
            int r5 = r5 + 1
            goto Lb
        L1f:
            r5 = -1
        L20:
            return r5
    }
}
