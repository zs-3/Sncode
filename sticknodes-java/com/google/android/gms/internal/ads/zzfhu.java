package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfhu {
    private final java.util.regex.Pattern zza;

    public zzfhu() {
            r2 = this;
            r2.<init>()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzgE     // Catch: java.util.regex.PatternSyntaxException -> L14
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.util.regex.PatternSyntaxException -> L14
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.util.regex.PatternSyntaxException -> L14
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.util.regex.PatternSyntaxException -> L14
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.util.regex.PatternSyntaxException -> L14
            goto L15
        L14:
            r0 = 0
        L15:
            r2.zza = r0
            return
    }

    public final java.lang.String zza(java.lang.String r2) {
            r1 = this;
            java.util.regex.Pattern r0 = r1.zza
            if (r0 == 0) goto L16
            if (r2 != 0) goto L7
            goto L16
        L7:
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r0 = r2.find()
            if (r0 == 0) goto L16
            java.lang.String r2 = r2.group()
            return r2
        L16:
            r2 = 0
            return r2
    }
}
