package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhg {
    private final com.google.android.gms.internal.ads.zzavn zza;

    public zzfhg(com.google.android.gms.internal.ads.zzavn r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private static final android.net.Uri zzb(android.net.Uri r8, java.lang.String r9) throws com.google.android.gms.internal.ads.zzavo {
            java.lang.String r0 = "ms"
            java.lang.String r1 = ";"
            java.lang.String r2 = "="
            r3 = 0
            r4 = -1
            if (r8 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r5 = r8.getHost()     // Catch: java.lang.NullPointerException -> Lb2 java.lang.UnsupportedOperationException -> L10a
            java.lang.String r6 = r8.getPath()     // Catch: java.lang.NullPointerException -> Lb2 java.lang.UnsupportedOperationException -> L10a
            if (r5 == 0) goto Lb2
            java.lang.String r7 = "xGN4Vue"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.NullPointerException -> Lb2 java.lang.UnsupportedOperationException -> L10a
            if (r5 == 0) goto Lb2
            if (r6 == 0) goto Lb2
            boolean r5 = r6.contains(r1)     // Catch: java.lang.NullPointerException -> Lb2 java.lang.UnsupportedOperationException -> L10a
            if (r5 == 0) goto Lb2
            java.lang.String r0 = r8.toString()     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r5 = "dc_ms="
            boolean r0 = r0.contains(r5)     // Catch: java.lang.UnsupportedOperationException -> L10a
            if (r0 != 0) goto Laa
            java.lang.String r0 = "dc_ms"
            java.lang.String r5 = r8.toString()     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r6 = ";adurl"
            int r6 = r5.indexOf(r6)     // Catch: java.lang.UnsupportedOperationException -> L10a
            if (r6 == r4) goto L68
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r6 = r6 + 1
            java.lang.String r3 = r5.substring(r3, r6)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r0)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r2)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r1)     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r9 = r5.length()     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r5, r6, r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.UnsupportedOperationException -> L10a
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.UnsupportedOperationException -> L10a
            goto L101
        L68:
            java.lang.String r8 = r8.getEncodedPath()     // Catch: java.lang.UnsupportedOperationException -> L10a
            if (r8 == 0) goto La4
            int r4 = r5.indexOf(r8)     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r7 = r8.length()     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r7 = r7 + r4
            java.lang.String r3 = r5.substring(r3, r7)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r6.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r6.append(r1)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r6.append(r0)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r6.append(r2)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r6.append(r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r6.append(r1)     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r8 = r8.length()     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r4 = r4 + r8
            int r8 = r5.length()     // Catch: java.lang.UnsupportedOperationException -> L10a
            r6.append(r5, r4, r8)     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r8 = r6.toString()     // Catch: java.lang.UnsupportedOperationException -> L10a
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.UnsupportedOperationException -> L10a
            goto L101
        La4:
            java.lang.UnsupportedOperationException r8 = new java.lang.UnsupportedOperationException     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.<init>()     // Catch: java.lang.UnsupportedOperationException -> L10a
            throw r8     // Catch: java.lang.UnsupportedOperationException -> L10a
        Laa:
            com.google.android.gms.internal.ads.zzavo r8 = new com.google.android.gms.internal.ads.zzavo     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r9 = "Parameter already exists: dc_ms"
            r8.<init>(r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            throw r8     // Catch: java.lang.UnsupportedOperationException -> L10a
        Lb2:
            java.lang.String r1 = r8.getQueryParameter(r0)     // Catch: java.lang.UnsupportedOperationException -> L10a
            if (r1 != 0) goto L102
            java.lang.String r1 = r8.toString()     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r5 = "&adurl"
            int r5 = r1.indexOf(r5)     // Catch: java.lang.UnsupportedOperationException -> L10a
            if (r5 != r4) goto Lca
            java.lang.String r5 = "?adurl"
            int r5 = r1.indexOf(r5)     // Catch: java.lang.UnsupportedOperationException -> L10a
        Lca:
            if (r5 == r4) goto Lf5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r5 = r5 + 1
            java.lang.String r3 = r1.substring(r3, r5)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r0)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r2)     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r9 = "&"
            r8.append(r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            int r9 = r1.length()     // Catch: java.lang.UnsupportedOperationException -> L10a
            r8.append(r1, r5, r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r8 = r8.toString()     // Catch: java.lang.UnsupportedOperationException -> L10a
            android.net.Uri r8 = android.net.Uri.parse(r8)     // Catch: java.lang.UnsupportedOperationException -> L10a
            goto L101
        Lf5:
            android.net.Uri$Builder r8 = r8.buildUpon()     // Catch: java.lang.UnsupportedOperationException -> L10a
            android.net.Uri$Builder r8 = r8.appendQueryParameter(r0, r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            android.net.Uri r8 = r8.build()     // Catch: java.lang.UnsupportedOperationException -> L10a
        L101:
            return r8
        L102:
            com.google.android.gms.internal.ads.zzavo r8 = new com.google.android.gms.internal.ads.zzavo     // Catch: java.lang.UnsupportedOperationException -> L10a
            java.lang.String r9 = "Query parameter already exists: ms"
            r8.<init>(r9)     // Catch: java.lang.UnsupportedOperationException -> L10a
            throw r8     // Catch: java.lang.UnsupportedOperationException -> L10a
        L10a:
            com.google.android.gms.internal.ads.zzavo r8 = new com.google.android.gms.internal.ads.zzavo
            java.lang.String r9 = "Provided Uri is not in a valid state"
            r8.<init>(r9)
            throw r8
    }

    public final android.net.Uri zza(android.net.Uri r3, android.content.Context r4, android.view.View r5, android.app.Activity r6) throws com.google.android.gms.internal.ads.zzavo {
            r2 = this;
            com.google.android.gms.internal.ads.zzavn r0 = r2.zza     // Catch: java.lang.UnsupportedOperationException -> L15
            com.google.android.gms.internal.ads.zzavi r0 = r0.zzc()     // Catch: java.lang.UnsupportedOperationException -> L15
            java.lang.String r1 = "ai"
            java.lang.String r1 = r3.getQueryParameter(r1)     // Catch: java.lang.UnsupportedOperationException -> L15
            java.lang.String r4 = r0.zzf(r4, r1, r5, r6)     // Catch: java.lang.UnsupportedOperationException -> L15
            android.net.Uri r3 = zzb(r3, r4)     // Catch: java.lang.UnsupportedOperationException -> L15
            return r3
        L15:
            com.google.android.gms.internal.ads.zzavo r3 = new com.google.android.gms.internal.ads.zzavo
            java.lang.String r4 = "Provided Uri is not in a valid state"
            r3.<init>(r4)
            throw r3
    }
}
