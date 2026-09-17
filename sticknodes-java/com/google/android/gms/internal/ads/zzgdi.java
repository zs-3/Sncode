package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzgdi implements java.io.FilenameFilter {
    private final java.util.regex.Pattern zza;

    public zzgdi(java.util.regex.Pattern r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            return
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File r1, java.lang.String r2) {
            r0 = this;
            java.util.regex.Pattern r1 = r0.zza
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            return r1
    }
}
