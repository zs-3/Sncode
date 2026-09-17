package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzbdf extends com.google.android.gms.internal.ads.zzbdg {
    zzbdf() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final java.lang.String zzb(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            return r6
        L7:
            int r0 = r6.length()
            r1 = 0
            r2 = 0
        Ld:
            int r3 = r6.length()
            r4 = 44
            if (r2 >= r3) goto L1e
            char r3 = r6.charAt(r2)
            if (r3 != r4) goto L1e
            int r2 = r2 + 1
            goto Ld
        L1e:
            if (r0 <= 0) goto L2a
            int r3 = r0 + (-1)
            char r5 = r6.charAt(r3)
            if (r5 != r4) goto L2a
            r0 = r3
            goto L1e
        L2a:
            if (r0 >= r2) goto L2e
            r6 = 0
            return r6
        L2e:
            if (r2 != 0) goto L38
            int r2 = r6.length()
            if (r0 == r2) goto L37
            goto L39
        L37:
            return r6
        L38:
            r1 = r2
        L39:
            java.lang.String r6 = r6.substring(r1, r0)
            return r6
    }

    @Override // com.google.android.gms.internal.ads.zzbdg
    public final java.lang.String zza(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = zzb(r2)
            java.lang.String r3 = zzb(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Lf
            return r3
        Lf:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L16
            return r2
        L16:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = ","
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
