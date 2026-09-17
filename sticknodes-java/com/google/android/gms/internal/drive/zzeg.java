package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final class zzeg extends com.google.android.gms.internal.drive.zzir {
    private final android.content.Context zzgw;

    private zzeg(android.os.Looper r1, android.content.Context r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zzgw = r2
            return
    }

    /* synthetic */ zzeg(android.os.Looper r1, android.content.Context r2, com.google.android.gms.internal.drive.zzef r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message r7) {
            r6 = this;
            int r0 = r7.what
            r1 = 0
            java.lang.String r2 = "EventCallback"
            r3 = 1
            if (r0 == r3) goto L18
            com.google.android.gms.common.internal.GmsLogger r7 = com.google.android.gms.internal.drive.zzee.zzai()
            java.lang.Object[] r0 = new java.lang.Object[r3]
            android.content.Context r3 = r6.zzgw
            r0[r1] = r3
            java.lang.String r1 = "Don't know how to handle this event in context %s"
            r7.efmt(r2, r1, r0)
            return
        L18:
            java.lang.Object r7 = r7.obj
            android.util.Pair r7 = (android.util.Pair) r7
            java.lang.Object r0 = r7.first
            com.google.android.gms.drive.events.zzi r0 = (com.google.android.gms.drive.events.zzi) r0
            java.lang.Object r7 = r7.second
            com.google.android.gms.drive.events.DriveEvent r7 = (com.google.android.gms.drive.events.DriveEvent) r7
            int r4 = r7.getType()
            if (r4 == r3) goto L8b
            r5 = 2
            if (r4 == r5) goto L83
            r5 = 3
            if (r4 == r5) goto L5e
            r5 = 4
            if (r4 == r5) goto L56
            r5 = 8
            if (r4 == r5) goto L45
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.android.gms.internal.drive.zzee.zzai()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r7
            java.lang.String r7 = "Unexpected event: %s"
            r0.wfmt(r2, r7, r3)
            return
        L45:
            com.google.android.gms.drive.events.zzr r7 = (com.google.android.gms.drive.events.zzr) r7
            com.google.android.gms.internal.drive.zzh r7 = r7.zzac()
            com.google.android.gms.internal.drive.zze r1 = new com.google.android.gms.internal.drive.zze
            r1.<init>(r7)
            com.google.android.gms.drive.events.zzl r0 = (com.google.android.gms.drive.events.zzl) r0
            r0.zza(r1)
            return
        L56:
            com.google.android.gms.drive.events.zzd r0 = (com.google.android.gms.drive.events.zzd) r0
            com.google.android.gms.drive.events.zzb r7 = (com.google.android.gms.drive.events.zzb) r7
            r0.zza(r7)
            return
        L5e:
            com.google.android.gms.drive.events.zzq r0 = (com.google.android.gms.drive.events.zzq) r0
            com.google.android.gms.drive.events.zzo r7 = (com.google.android.gms.drive.events.zzo) r7
            com.google.android.gms.common.data.DataHolder r1 = r7.zzz()
            if (r1 == 0) goto L75
            com.google.android.gms.drive.MetadataBuffer r2 = new com.google.android.gms.drive.MetadataBuffer
            r2.<init>(r1)
            com.google.android.gms.internal.drive.zzeh r1 = new com.google.android.gms.internal.drive.zzeh
            r1.<init>(r2)
            r0.zza(r1)
        L75:
            boolean r1 = r7.zzaa()
            if (r1 == 0) goto L82
            int r7 = r7.zzab()
            r0.zzc(r7)
        L82:
            return
        L83:
            com.google.android.gms.drive.events.CompletionListener r0 = (com.google.android.gms.drive.events.CompletionListener) r0
            com.google.android.gms.drive.events.CompletionEvent r7 = (com.google.android.gms.drive.events.CompletionEvent) r7
            r0.onCompletion(r7)
            return
        L8b:
            com.google.android.gms.drive.events.ChangeListener r0 = (com.google.android.gms.drive.events.ChangeListener) r0
            com.google.android.gms.drive.events.ChangeEvent r7 = (com.google.android.gms.drive.events.ChangeEvent) r7
            r0.onChange(r7)
            return
    }
}
