package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfph {
    private static final java.util.regex.Pattern zza = null;
    private final java.util.List zzb;

    static {
            java.lang.String r0 = "^[a-zA-Z0-9 ]+$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.internal.ads.zzfph.zza = r0
            return
    }

    public zzfph() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zzb = r0
            return
    }

    public final java.util.List zza() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    public final void zzb(android.view.View r4, com.google.android.gms.internal.ads.zzfop r5, java.lang.String r6) {
            r3 = this;
            if (r4 == 0) goto L43
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.zzfph.zza
            java.lang.String r0 = "Ad overlay"
            java.util.regex.Matcher r6 = r6.matcher(r0)
            boolean r6 = r6.matches()
            if (r6 == 0) goto L3b
            java.util.List r6 = r3.zzb
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r6.next()
            com.google.android.gms.internal.ads.zzfpg r1 = (com.google.android.gms.internal.ads.zzfpg) r1
            com.google.android.gms.internal.ads.zzfqs r2 = r1.zzb()
            java.lang.Object r2 = r2.get()
            if (r2 != r4) goto L16
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 != 0) goto L3a
            java.util.List r6 = r3.zzb
            com.google.android.gms.internal.ads.zzfpg r1 = new com.google.android.gms.internal.ads.zzfpg
            r1.<init>(r4, r5, r0)
            r6.add(r1)
        L3a:
            return
        L3b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space"
            r4.<init>(r5)
            throw r4
        L43:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "FriendlyObstruction is null"
            r4.<init>(r5)
            throw r4
    }

    public final void zzc() {
            r1 = this;
            java.util.List r0 = r1.zzb
            r0.clear()
            return
    }
}
