package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbag implements java.util.Comparator {
    public zzbag(com.google.android.gms.internal.ads.zzbah r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            com.google.android.gms.internal.ads.zzazv r6 = (com.google.android.gms.internal.ads.zzazv) r6
            com.google.android.gms.internal.ads.zzazv r7 = (com.google.android.gms.internal.ads.zzazv) r7
            float r0 = r6.zzd()
            float r1 = r7.zzd()
            r2 = 1
            r3 = -1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L14
        L12:
            r2 = -1
            goto L6c
        L14:
            float r0 = r6.zzd()
            float r1 = r7.zzd()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L21
            goto L6c
        L21:
            float r0 = r6.zzb()
            float r1 = r7.zzb()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2e
            goto L12
        L2e:
            float r0 = r6.zzb()
            float r1 = r7.zzb()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3b
            goto L6c
        L3b:
            float r0 = r6.zza()
            float r1 = r6.zzd()
            float r0 = r0 - r1
            float r1 = r6.zzc()
            float r6 = r6.zzb()
            float r1 = r1 - r6
            float r6 = r7.zza()
            float r4 = r7.zzd()
            float r6 = r6 - r4
            float r4 = r7.zzc()
            float r7 = r7.zzb()
            float r4 = r4 - r7
            float r0 = r0 * r1
            float r6 = r6 * r4
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 <= 0) goto L68
            goto L12
        L68:
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L6d
        L6c:
            return r2
        L6d:
            r6 = 0
            return r6
    }
}
