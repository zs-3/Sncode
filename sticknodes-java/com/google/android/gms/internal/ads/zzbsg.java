package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbsg extends com.google.android.gms.internal.ads.zzbsp {
    private final java.util.Map zza;
    private final android.content.Context zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final long zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;

    public zzbsg(com.google.android.gms.internal.ads.zzcfo r2, java.util.Map r3) {
            r1 = this;
            java.lang.String r0 = "createCalendarEvent"
            r1.<init>(r2, r0)
            r1.zza = r3
            android.app.Activity r2 = r2.zzi()
            r1.zzb = r2
            java.lang.String r2 = "description"
            java.lang.String r2 = r1.zze(r2)
            r1.zzc = r2
            java.lang.String r2 = "summary"
            java.lang.String r2 = r1.zze(r2)
            r1.zzf = r2
            java.lang.String r2 = "start_ticks"
            long r2 = r1.zzd(r2)
            r1.zzd = r2
            java.lang.String r2 = "end_ticks"
            long r2 = r1.zzd(r2)
            r1.zze = r2
            java.lang.String r2 = "location"
            java.lang.String r2 = r1.zze(r2)
            r1.zzg = r2
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.gms.internal.ads.zzbsg r0) {
            android.content.Context r0 = r0.zzb
            return r0
    }

    private final long zzd(java.lang.String r3) {
            r2 = this;
            java.util.Map r0 = r2.zza
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            r0 = -1
            if (r3 != 0) goto Ld
            return r0
        Ld:
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L11
        L11:
            return r0
    }

    private final java.lang.String zze(java.lang.String r2) {
            r1 = this;
            java.util.Map r0 = r1.zza
            java.lang.Object r0 = r0.get(r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            java.lang.String r2 = ""
            goto L19
        L11:
            java.util.Map r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
        L19:
            return r2
    }

    final android.content.Intent zzb() {
            r6 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.EDIT"
            r0.<init>(r1)
            android.net.Uri r1 = android.provider.CalendarContract.Events.CONTENT_URI
            android.content.Intent r0 = r0.setData(r1)
            java.lang.String r1 = r6.zzc
            java.lang.String r2 = "title"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.zzg
            java.lang.String r2 = "eventLocation"
            r0.putExtra(r2, r1)
            java.lang.String r1 = r6.zzf
            java.lang.String r2 = "description"
            r0.putExtra(r2, r1)
            long r1 = r6.zzd
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L2f
            java.lang.String r5 = "beginTime"
            r0.putExtra(r5, r1)
        L2f:
            long r1 = r6.zze
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L3a
            java.lang.String r3 = "endTime"
            r0.putExtra(r3, r1)
        L3a:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.setFlags(r1)
            return r0
    }

    public final void zzc() {
            r4 = this;
            android.content.Context r0 = r4.zzb
            if (r0 != 0) goto La
            java.lang.String r0 = "Activity context is not available."
            r4.zzh(r0)
            return
        La:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r4.zzb
            com.google.android.gms.internal.ads.zzbcd r1 = new com.google.android.gms.internal.ads.zzbcd
            r1.<init>(r0)
            boolean r0 = r1.zzb()
            if (r0 != 0) goto L20
            java.lang.String r0 = "This feature is not available on the device."
            r4.zzh(r0)
            return
        L20:
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r4.zzb
            android.app.AlertDialog$Builder r0 = com.google.android.gms.ads.internal.util.zzt.zzK(r0)
            com.google.android.gms.internal.ads.zzcad r1 = com.google.android.gms.ads.internal.zzu.zzo()
            android.content.res.Resources r1 = r1.zze()
            if (r1 == 0) goto L3a
            int r2 = com.google.android.gms.ads.impl.R.string.s5
            java.lang.String r2 = r1.getString(r2)
            goto L3c
        L3a:
            java.lang.String r2 = "Create calendar event"
        L3c:
            r0.setTitle(r2)
            if (r1 == 0) goto L48
            int r2 = com.google.android.gms.ads.impl.R.string.s6
            java.lang.String r2 = r1.getString(r2)
            goto L4a
        L48:
            java.lang.String r2 = "Allow Ad to create a calendar event?"
        L4a:
            r0.setMessage(r2)
            if (r1 == 0) goto L56
            int r2 = com.google.android.gms.ads.impl.R.string.s3
            java.lang.String r2 = r1.getString(r2)
            goto L58
        L56:
            java.lang.String r2 = "Accept"
        L58:
            com.google.android.gms.internal.ads.zzbse r3 = new com.google.android.gms.internal.ads.zzbse
            r3.<init>(r4)
            r0.setPositiveButton(r2, r3)
            if (r1 == 0) goto L69
            int r2 = com.google.android.gms.ads.impl.R.string.s4
            java.lang.String r1 = r1.getString(r2)
            goto L6b
        L69:
            java.lang.String r1 = "Decline"
        L6b:
            com.google.android.gms.internal.ads.zzbsf r2 = new com.google.android.gms.internal.ads.zzbsf
            r2.<init>(r4)
            r0.setNegativeButton(r1, r2)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return
    }
}
