package com.google.android.gms.internal.drive;

/* loaded from: classes.dex */
final /* synthetic */ class zzdj implements com.google.android.gms.drive.events.ChangeListener {
    private final com.google.android.gms.drive.events.OnChangeListener zzgi;

    private zzdj(com.google.android.gms.drive.events.OnChangeListener r1) {
            r0 = this;
            r0.<init>()
            r0.zzgi = r1
            return
    }

    static com.google.android.gms.drive.events.ChangeListener zza(com.google.android.gms.drive.events.OnChangeListener r1) {
            com.google.android.gms.internal.drive.zzdj r0 = new com.google.android.gms.internal.drive.zzdj
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.gms.drive.events.ChangeListener
    public final void onChange(com.google.android.gms.drive.events.ChangeEvent r2) {
            r1 = this;
            com.google.android.gms.drive.events.OnChangeListener r0 = r1.zzgi
            r0.onChange(r2)
            return
    }
}
