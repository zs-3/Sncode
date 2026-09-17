package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final class zzjc {
    public static final android.net.Uri zza = null;
    public static final android.net.Uri zzb = null;
    public static final java.util.regex.Pattern zzc = null;
    public static final java.util.regex.Pattern zzd = null;

    static {
            java.lang.String r0 = "content://com.google.android.gsf.gservices"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.gms.internal.measurement.zzjc.zza = r0
            java.lang.String r0 = "content://com.google.android.gsf.gservices/prefix"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.gms.internal.measurement.zzjc.zzb = r0
            java.lang.String r0 = "^(1|true|t|on|yes|y)$"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.measurement.zzjc.zzc = r0
            java.lang.String r0 = "^(0|false|f|off|no|n)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            com.google.android.gms.internal.measurement.zzjc.zzd = r0
            return
    }
}
