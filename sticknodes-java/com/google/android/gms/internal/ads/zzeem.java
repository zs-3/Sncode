package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzeem extends com.google.android.gms.internal.ads.zzeeq {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.graphics.drawable.Drawable zzc;

    zzeem(java.lang.String r2, java.lang.String r3, android.graphics.drawable.Drawable r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Null advertiserName"
            java.util.Objects.requireNonNull(r2, r0)
            r1.zza = r2
            java.lang.String r2 = "Null imageUrl"
            java.util.Objects.requireNonNull(r3, r2)
            r1.zzb = r3
            r1.zzc = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.internal.ads.zzeeq
            r2 = 0
            if (r1 == 0) goto L3a
            com.google.android.gms.internal.ads.zzeeq r5 = (com.google.android.gms.internal.ads.zzeeq) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zzb()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzc()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            android.graphics.drawable.Drawable r1 = r4.zzc
            if (r1 != 0) goto L2e
            android.graphics.drawable.Drawable r5 = r5.zza()
            if (r5 != 0) goto L3a
            goto L39
        L2e:
            android.graphics.drawable.Drawable r5 = r5.zza()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L39
            goto L3a
        L39:
            return r0
        L3a:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r3.zzb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            android.graphics.drawable.Drawable r2 = r3.zzc
            if (r2 != 0) goto L19
            r2 = 0
            goto L1d
        L19:
            int r2 = r2.hashCode()
        L1d:
            int r0 = r0 * r1
            r0 = r0 ^ r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "OfflineAdAssets{advertiserName="
            r1.append(r2)
            java.lang.String r2 = r3.zza
            r1.append(r2)
            java.lang.String r2 = ", imageUrl="
            r1.append(r2)
            java.lang.String r2 = r3.zzb
            r1.append(r2)
            java.lang.String r2 = ", icon="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeeq
    final android.graphics.drawable.Drawable zza() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.zzc
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeeq
    final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.ads.zzeeq
    final java.lang.String zzc() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }
}
