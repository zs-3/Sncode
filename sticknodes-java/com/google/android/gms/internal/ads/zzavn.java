package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzavn {
    private static final java.lang.String[] zza = null;
    private final java.lang.String zzb;
    private final java.lang.String[] zzc;
    private final com.google.android.gms.internal.ads.zzavi zzd;

    static {
            java.lang.String r0 = "/aclk"
            java.lang.String r1 = "/pcs/click"
            java.lang.String r2 = "/dbm/clk"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            com.google.android.gms.internal.ads.zzavn.zza = r0
            return
    }

    @java.lang.Deprecated
    public zzavn(com.google.android.gms.internal.ads.zzavi r4) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "xGN4Vue"
            r3.zzb = r0
            java.lang.String r0 = "xGN4Vue"
            java.lang.String r1 = "xGN4Vue"
            java.lang.String r2 = ".googlesyndication.com"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            r3.zzc = r0
            r3.zzd = r4
            return
    }

    private final android.net.Uri zzg(android.net.Uri r9, java.lang.String r10) throws com.google.android.gms.internal.ads.zzavo {
            r8 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "="
            java.lang.String r2 = ";"
            java.util.Objects.requireNonNull(r9)
            r3 = 0
            r4 = -1
            java.lang.String r5 = r9.getHost()     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r6 = r8.zzb     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lfd
            boolean r5 = r5.equals(r6)     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lfd
            if (r5 == 0) goto La5
            java.lang.String r5 = r9.getPath()     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lfd
            boolean r5 = r5.contains(r2)     // Catch: java.lang.NullPointerException -> La5 java.lang.UnsupportedOperationException -> Lfd
            if (r5 == 0) goto La5
            java.lang.String r0 = r9.toString()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r5 = "dc_ms="
            boolean r0 = r0.contains(r5)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            if (r0 != 0) goto L9d
            java.lang.String r0 = "dc_ms"
            java.lang.String r5 = r9.toString()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r6 = ";adurl"
            int r6 = r5.indexOf(r6)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            if (r6 == r4) goto L63
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Lfd
            int r6 = r6 + 1
            java.lang.String r3 = r5.substring(r3, r6)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r0)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r1)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r2)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r10 = r5.substring(r6)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r9 = r9.toString()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            goto Lf4
        L63:
            java.lang.String r9 = r9.getEncodedPath()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            int r4 = r5.indexOf(r9)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Lfd
            int r7 = r9.length()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            int r7 = r7 + r4
            java.lang.String r3 = r5.substring(r3, r7)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r6.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r6.append(r2)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r6.append(r0)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r6.append(r1)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r6.append(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r6.append(r2)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            int r9 = r9.length()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            int r4 = r4 + r9
            java.lang.String r9 = r5.substring(r4)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r6.append(r9)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r9 = r6.toString()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            goto Lf4
        L9d:
            com.google.android.gms.internal.ads.zzavo r9 = new com.google.android.gms.internal.ads.zzavo     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r10 = "Parameter already exists: dc_ms"
            r9.<init>(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            throw r9     // Catch: java.lang.UnsupportedOperationException -> Lfd
        La5:
            java.lang.String r2 = r9.getQueryParameter(r0)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            if (r2 != 0) goto Lf5
            java.lang.String r2 = r9.toString()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r5 = "&adurl"
            int r5 = r2.indexOf(r5)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            if (r5 != r4) goto Lbd
            java.lang.String r5 = "?adurl"
            int r5 = r2.indexOf(r5)     // Catch: java.lang.UnsupportedOperationException -> Lfd
        Lbd:
            if (r5 == r4) goto Le8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.UnsupportedOperationException -> Lfd
            int r5 = r5 + 1
            java.lang.String r3 = r2.substring(r3, r5)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.<init>(r3)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r0)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r1)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r10 = "&"
            r9.append(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r10 = r2.substring(r5)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            r9.append(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r9 = r9.toString()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            goto Lf4
        Le8:
            android.net.Uri$Builder r9 = r9.buildUpon()     // Catch: java.lang.UnsupportedOperationException -> Lfd
            android.net.Uri$Builder r9 = r9.appendQueryParameter(r0, r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            android.net.Uri r9 = r9.build()     // Catch: java.lang.UnsupportedOperationException -> Lfd
        Lf4:
            return r9
        Lf5:
            com.google.android.gms.internal.ads.zzavo r9 = new com.google.android.gms.internal.ads.zzavo     // Catch: java.lang.UnsupportedOperationException -> Lfd
            java.lang.String r10 = "Query parameter already exists: ms"
            r9.<init>(r10)     // Catch: java.lang.UnsupportedOperationException -> Lfd
            throw r9     // Catch: java.lang.UnsupportedOperationException -> Lfd
        Lfd:
            com.google.android.gms.internal.ads.zzavo r9 = new com.google.android.gms.internal.ads.zzavo
            java.lang.String r10 = "Provided Uri is not in a valid state"
            r9.<init>(r10)
            throw r9
    }

    @java.lang.Deprecated
    public final android.net.Uri zza(android.net.Uri r3, android.content.Context r4, android.view.View r5, android.app.Activity r6) throws com.google.android.gms.internal.ads.zzavo {
            r2 = this;
            com.google.android.gms.internal.ads.zzavi r0 = r2.zzd     // Catch: java.lang.UnsupportedOperationException -> L11
            java.lang.String r1 = "ai"
            java.lang.String r1 = r3.getQueryParameter(r1)     // Catch: java.lang.UnsupportedOperationException -> L11
            java.lang.String r4 = r0.zzf(r4, r1, r5, r6)     // Catch: java.lang.UnsupportedOperationException -> L11
            android.net.Uri r3 = r2.zzg(r3, r4)     // Catch: java.lang.UnsupportedOperationException -> L11
            return r3
        L11:
            com.google.android.gms.internal.ads.zzavo r3 = new com.google.android.gms.internal.ads.zzavo
            java.lang.String r4 = "Provided Uri is not in a valid state"
            r3.<init>(r4)
            throw r3
    }

    @java.lang.Deprecated
    public final android.net.Uri zzb(android.net.Uri r2, android.content.Context r3) throws com.google.android.gms.internal.ads.zzavo {
            r1 = this;
            com.google.android.gms.internal.ads.zzavi r0 = r1.zzd
            java.lang.String r3 = r0.zzg(r3)
            android.net.Uri r2 = r1.zzg(r2, r3)
            return r2
    }

    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzavi zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzavi r0 = r1.zzd
            return r0
    }

    @java.lang.Deprecated
    public final void zzd(android.view.MotionEvent r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzavi r0 = r1.zzd
            r0.zzk(r2)
            return
    }

    public final boolean zze(android.net.Uri r6) {
            r5 = this;
            boolean r0 = r5.zzf(r6)
            r1 = 0
            if (r0 == 0) goto L1e
            java.lang.String[] r0 = com.google.android.gms.internal.ads.zzavn.zza
            r2 = 0
        La:
            r3 = 3
            if (r2 >= r3) goto L1e
            r3 = r0[r2]
            java.lang.String r4 = r6.getPath()
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L1b
            r6 = 1
            return r6
        L1b:
            int r2 = r2 + 1
            goto La
        L1e:
            return r1
    }

    public final boolean zzf(android.net.Uri r5) {
            r4 = this;
            java.util.Objects.requireNonNull(r5)
            r0 = 0
            java.lang.String r5 = r5.getHost()     // Catch: java.lang.NullPointerException -> L1b
            java.lang.String[] r1 = r4.zzc     // Catch: java.lang.NullPointerException -> L1b
            r2 = 0
        Lb:
            r3 = 3
            if (r2 >= r3) goto L1b
            r3 = r1[r2]     // Catch: java.lang.NullPointerException -> L1b
            boolean r3 = r5.endsWith(r3)     // Catch: java.lang.NullPointerException -> L1b
            if (r3 == 0) goto L18
            r5 = 1
            return r5
        L18:
            int r2 = r2 + 1
            goto Lb
        L1b:
            return r0
    }
}
