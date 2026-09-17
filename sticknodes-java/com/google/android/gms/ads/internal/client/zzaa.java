package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaa {
    private final com.google.android.gms.ads.AdSize[] zza;
    private final java.lang.String zzb;

    public zzaa(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>()
            android.content.res.Resources r4 = r4.getResources()
            int[] r0 = com.google.android.gms.ads.R.styleable.AdsAttrs
            android.content.res.TypedArray r4 = r4.obtainAttributes(r5, r0)
            int r5 = com.google.android.gms.ads.R.styleable.AdsAttrs_adSize
            java.lang.String r5 = r4.getString(r5)
            int r0 = com.google.android.gms.ads.R.styleable.AdsAttrs_adSizes
            java.lang.String r0 = r4.getString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            r1 = r1 ^ 1
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r2 = r2 ^ 1
            if (r1 == 0) goto L30
            if (r2 != 0) goto L30
            com.google.android.gms.ads.AdSize[] r5 = zzc(r5)
            r3.zza = r5
            goto L3a
        L30:
            if (r1 != 0) goto L54
            if (r2 == 0) goto L54
            com.google.android.gms.ads.AdSize[] r5 = zzc(r0)
            r3.zza = r5
        L3a:
            int r5 = com.google.android.gms.ads.R.styleable.AdsAttrs_adUnitId
            java.lang.String r5 = r4.getString(r5)
            r3.zzb = r5
            r4.recycle()
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L4c
            return
        L4c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required XML attribute \"adUnitId\" was missing."
            r4.<init>(r5)
            throw r4
        L54:
            if (r1 == 0) goto L61
            r4.recycle()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Either XML attribute \"adSize\" or XML attribute \"supportedAdSizes\" should be specified, but not both."
            r4.<init>(r5)
            throw r4
        L61:
            r4.recycle()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required XML attribute \"adSize\" was missing."
            r4.<init>(r5)
            throw r4
    }

    private static com.google.android.gms.ads.AdSize[] zzc(java.lang.String r12) {
            java.lang.String r0 = "\\s*,\\s*"
            java.lang.String[] r0 = r12.split(r0)
            int r1 = r0.length
            com.google.android.gms.ads.AdSize[] r2 = new com.google.android.gms.ads.AdSize[r1]
            r3 = 0
            r4 = 0
        Lb:
            int r5 = r0.length
            java.lang.String r6 = "Could not parse XML attribute \"adSize\": "
            if (r4 >= r5) goto Lef
            r5 = r0[r4]
            java.lang.String r5 = r5.trim()
            java.lang.String r7 = "^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"
            boolean r7 = r5.matches(r7)
            if (r7 == 0) goto L6c
            java.lang.String r7 = "[xX]"
            java.lang.String[] r7 = r5.split(r7)
            r8 = r7[r3]
            java.lang.String r8 = r8.trim()
            r7[r3] = r8
            r8 = 1
            r9 = r7[r8]
            java.lang.String r9 = r9.trim()
            r7[r8] = r9
            java.lang.String r9 = "FULL_WIDTH"
            r10 = r7[r3]     // Catch: java.lang.NumberFormatException -> L62
            boolean r9 = r9.equals(r10)     // Catch: java.lang.NumberFormatException -> L62
            if (r9 == 0) goto L41
            r9 = -1
            goto L47
        L41:
            r9 = r7[r3]     // Catch: java.lang.NumberFormatException -> L62
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L62
        L47:
            java.lang.String r10 = "AUTO_HEIGHT"
            r11 = r7[r8]     // Catch: java.lang.NumberFormatException -> L62
            boolean r10 = r10.equals(r11)     // Catch: java.lang.NumberFormatException -> L62
            if (r10 == 0) goto L53
            r5 = -2
            goto L59
        L53:
            r7 = r7[r8]     // Catch: java.lang.NumberFormatException -> L62
            int r5 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L62
        L59:
            com.google.android.gms.ads.AdSize r6 = new com.google.android.gms.ads.AdSize
            r6.<init>(r9, r5)
            r2[r4] = r6
            goto Le1
        L62:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.concat(r5)
            r12.<init>(r0)
            throw r12
        L6c:
            java.lang.String r7 = "BANNER"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L7a
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.BANNER
            r2[r4] = r5
            goto Le1
        L7a:
            java.lang.String r7 = "LARGE_BANNER"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L87
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.LARGE_BANNER
            r2[r4] = r5
            goto Le1
        L87:
            java.lang.String r7 = "FULL_BANNER"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L94
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.FULL_BANNER
            r2[r4] = r5
            goto Le1
        L94:
            java.lang.String r7 = "LEADERBOARD"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto La1
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.LEADERBOARD
            r2[r4] = r5
            goto Le1
        La1:
            java.lang.String r7 = "MEDIUM_RECTANGLE"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto Lae
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE
            r2[r4] = r5
            goto Le1
        Lae:
            java.lang.String r7 = "SMART_BANNER"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto Lbb
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.SMART_BANNER
            r2[r4] = r5
            goto Le1
        Lbb:
            java.lang.String r7 = "WIDE_SKYSCRAPER"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto Lc8
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.WIDE_SKYSCRAPER
            r2[r4] = r5
            goto Le1
        Lc8:
            java.lang.String r7 = "FLUID"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto Ld5
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.FLUID
            r2[r4] = r5
            goto Le1
        Ld5:
            java.lang.String r7 = "ICON"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto Le5
            com.google.android.gms.ads.AdSize r5 = com.google.android.gms.ads.AdSize.zza
            r2[r4] = r5
        Le1:
            int r4 = r4 + 1
            goto Lb
        Le5:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r6.concat(r5)
            r12.<init>(r0)
            throw r12
        Lef:
            if (r1 == 0) goto Lf2
            return r2
        Lf2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r12 = r6.concat(r12)
            r0.<init>(r12)
            throw r0
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.ads.AdSize[] zzb(boolean r2) {
            r1 = this;
            if (r2 != 0) goto L11
            com.google.android.gms.ads.AdSize[] r2 = r1.zza
            int r2 = r2.length
            r0 = 1
            if (r2 != r0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The adSizes XML attribute is only allowed on PublisherAdViews."
            r2.<init>(r0)
            throw r2
        L11:
            com.google.android.gms.ads.AdSize[] r2 = r1.zza
            return r2
    }
}
