package com.google.android.gms.drive.events;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "QueryResultEventParcelableCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzo extends com.google.android.gms.drive.zzu implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzo> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final com.google.android.gms.common.data.DataHolder zzav;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final boolean zzcq;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 4)
    private final int zzcr;

    static {
            com.google.android.gms.drive.events.zzp r0 = new com.google.android.gms.drive.events.zzp
            r0.<init>()
            com.google.android.gms.drive.events.zzo.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    public zzo(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) com.google.android.gms.common.data.DataHolder r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) boolean r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 4) int r3) {
            r0 = this;
            r0.<init>()
            r0.zzav = r1
            r0.zzcq = r2
            r0.zzcr = r3
            return
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
            r1 = this;
            r0 = 3
            return r0
    }

    @Override // com.google.android.gms.drive.zzu
    public final void zza(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            com.google.android.gms.common.data.DataHolder r1 = r4.zzav
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            boolean r6 = r4.zzcq
            r1 = 3
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r1, r6)
            int r6 = r4.zzcr
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r1, r6)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final boolean zzaa() {
            r1 = this;
            boolean r0 = r1.zzcq
            return r0
    }

    public final int zzab() {
            r1 = this;
            int r0 = r1.zzcr
            return r0
    }

    public final com.google.android.gms.common.data.DataHolder zzz() {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zzav
            return r0
    }
}
