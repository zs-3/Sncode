package com.google.android.gms.internal.drive;

@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class(creator = "OnEventResponseCreator")
@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved({1, 4, 8})
/* loaded from: classes.dex */
public final class zzfp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfp> CREATOR = null;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 2)
    private final int zzda;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 3)
    private final com.google.android.gms.drive.events.ChangeEvent zzib;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 5)
    private final com.google.android.gms.drive.events.CompletionEvent zzic;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 6)
    private final com.google.android.gms.drive.events.zzo zzid;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 7)
    private final com.google.android.gms.drive.events.zzb zzie;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 9)
    private final com.google.android.gms.drive.events.zzv zzif;

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Field(id = 10)
    private final com.google.android.gms.drive.events.zzr zzig;

    static {
            com.google.android.gms.internal.drive.zzfq r0 = new com.google.android.gms.internal.drive.zzfq
            r0.<init>()
            com.google.android.gms.internal.drive.zzfp.CREATOR = r0
            return
    }

    @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Constructor
    zzfp(@com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 2) int r1, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 3) com.google.android.gms.drive.events.ChangeEvent r2, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 5) com.google.android.gms.drive.events.CompletionEvent r3, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 6) com.google.android.gms.drive.events.zzo r4, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 7) com.google.android.gms.drive.events.zzb r5, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 9) com.google.android.gms.drive.events.zzv r6, @com.google.android.gms.common.internal.safeparcel.SafeParcelable.Param(id = 10) com.google.android.gms.drive.events.zzr r7) {
            r0 = this;
            r0.<init>()
            r0.zzda = r1
            r0.zzib = r2
            r0.zzic = r3
            r0.zzid = r4
            r0.zzie = r5
            r0.zzif = r6
            r0.zzig = r7
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            int r1 = r4.zzda
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r1)
            com.google.android.gms.drive.events.ChangeEvent r1 = r4.zzib
            r2 = 3
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.events.CompletionEvent r1 = r4.zzic
            r2 = 5
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.events.zzo r1 = r4.zzid
            r2 = 6
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.events.zzb r1 = r4.zzie
            r2 = 7
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.events.zzv r1 = r4.zzif
            r2 = 9
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.drive.events.zzr r1 = r4.zzig
            r2 = 10
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r1, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r0)
            return
    }

    public final com.google.android.gms.drive.events.DriveEvent zzat() {
            r4 = this;
            int r0 = r4.zzda
            r1 = 1
            if (r0 == r1) goto L3f
            r1 = 2
            if (r0 == r1) goto L3c
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 4
            if (r0 == r1) goto L36
            r1 = 7
            if (r0 == r1) goto L33
            r1 = 8
            if (r0 != r1) goto L18
            com.google.android.gms.drive.events.zzr r0 = r4.zzig
            return r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r1 = r4.zzda
            r2 = 33
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Unexpected event type "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L33:
            com.google.android.gms.drive.events.zzv r0 = r4.zzif
            return r0
        L36:
            com.google.android.gms.drive.events.zzb r0 = r4.zzie
            return r0
        L39:
            com.google.android.gms.drive.events.zzo r0 = r4.zzid
            return r0
        L3c:
            com.google.android.gms.drive.events.CompletionEvent r0 = r4.zzic
            return r0
        L3f:
            com.google.android.gms.drive.events.ChangeEvent r0 = r4.zzib
            return r0
    }
}
