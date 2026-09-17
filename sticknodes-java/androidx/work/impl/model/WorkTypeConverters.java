package androidx.work.impl.model;

/* loaded from: classes.dex */
public class WorkTypeConverters {

    /* renamed from: androidx.work.impl.model.WorkTypeConverters$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$BackoffPolicy = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$OutOfQuotaPolicy = null;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$WorkInfo$State = null;

        static {
                androidx.work.OutOfQuotaPolicy[] r0 = androidx.work.OutOfQuotaPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$OutOfQuotaPolicy = r0
                r1 = 1
                androidx.work.OutOfQuotaPolicy r2 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$OutOfQuotaPolicy     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.work.OutOfQuotaPolicy r3 = androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                androidx.work.NetworkType[] r2 = androidx.work.NetworkType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$NetworkType = r2
                androidx.work.NetworkType r3 = androidx.work.NetworkType.NOT_REQUIRED     // Catch: java.lang.NoSuchFieldError -> L2e
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e
                r2[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r2 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L38
                androidx.work.NetworkType r3 = androidx.work.NetworkType.CONNECTED     // Catch: java.lang.NoSuchFieldError -> L38
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L38
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L38
            L38:
                r2 = 3
                int[] r3 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L43
                androidx.work.NetworkType r4 = androidx.work.NetworkType.UNMETERED     // Catch: java.lang.NoSuchFieldError -> L43
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L43
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L43
            L43:
                r3 = 4
                int[] r4 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L4e
                androidx.work.NetworkType r5 = androidx.work.NetworkType.NOT_ROAMING     // Catch: java.lang.NoSuchFieldError -> L4e
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                r4 = 5
                int[] r5 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$NetworkType     // Catch: java.lang.NoSuchFieldError -> L59
                androidx.work.NetworkType r6 = androidx.work.NetworkType.METERED     // Catch: java.lang.NoSuchFieldError -> L59
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L59
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L59
            L59:
                androidx.work.BackoffPolicy[] r5 = androidx.work.BackoffPolicy.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$BackoffPolicy = r5
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.EXPONENTIAL     // Catch: java.lang.NoSuchFieldError -> L6a
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6a
                r5[r6] = r1     // Catch: java.lang.NoSuchFieldError -> L6a
            L6a:
                int[] r5 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$BackoffPolicy     // Catch: java.lang.NoSuchFieldError -> L74
                androidx.work.BackoffPolicy r6 = androidx.work.BackoffPolicy.LINEAR     // Catch: java.lang.NoSuchFieldError -> L74
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L74
                r5[r6] = r0     // Catch: java.lang.NoSuchFieldError -> L74
            L74:
                androidx.work.WorkInfo$State[] r5 = androidx.work.WorkInfo.State.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State = r5
                androidx.work.WorkInfo$State r6 = androidx.work.WorkInfo.State.ENQUEUED     // Catch: java.lang.NoSuchFieldError -> L85
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L85
                r5[r6] = r1     // Catch: java.lang.NoSuchFieldError -> L85
            L85:
                int[] r1 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State     // Catch: java.lang.NoSuchFieldError -> L8f
                androidx.work.WorkInfo$State r5 = androidx.work.WorkInfo.State.RUNNING     // Catch: java.lang.NoSuchFieldError -> L8f
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r1[r5] = r0     // Catch: java.lang.NoSuchFieldError -> L8f
            L8f:
                int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State     // Catch: java.lang.NoSuchFieldError -> L99
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.SUCCEEDED     // Catch: java.lang.NoSuchFieldError -> L99
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L99
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L99
            L99:
                int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State     // Catch: java.lang.NoSuchFieldError -> La3
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.FAILED     // Catch: java.lang.NoSuchFieldError -> La3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La3
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> La3
            La3:
                int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State     // Catch: java.lang.NoSuchFieldError -> Lad
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.BLOCKED     // Catch: java.lang.NoSuchFieldError -> Lad
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lad
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> Lad
            Lad:
                int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State     // Catch: java.lang.NoSuchFieldError -> Lb8
                androidx.work.WorkInfo$State r1 = androidx.work.WorkInfo.State.CANCELLED     // Catch: java.lang.NoSuchFieldError -> Lb8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb8
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb8
            Lb8:
                return
        }
    }

    public static int backoffPolicyToInt(androidx.work.BackoffPolicy r3) {
            int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$BackoffPolicy
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2b
            r2 = 2
            if (r0 != r2) goto Lf
            return r1
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to int"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            r3 = 0
            return r3
    }

    public static androidx.work.ContentUriTriggers byteArrayToContentUriTriggers(byte[] r6) {
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.add(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
    }

    public static byte[] contentUriTriggersToByteArray(androidx.work.ContentUriTriggers r4) {
            int r0 = r4.size()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L54
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            r2.writeInt(r1)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            java.util.Set r4 = r4.getTriggers()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
        L21:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            androidx.work.ContentUriTriggers$Trigger r1 = (androidx.work.ContentUriTriggers.Trigger) r1     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            android.net.Uri r3 = r1.getUri()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            r2.writeUTF(r3)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            boolean r1 = r1.shouldTriggerForDescendants()     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            r2.writeBoolean(r1)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4f
            goto L21
        L40:
            r2.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r4 = move-exception
            r4.printStackTrace()
        L48:
            r0.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L4c:
            r4 = move-exception
            r1 = r2
            goto L6f
        L4f:
            r4 = move-exception
            r1 = r2
            goto L55
        L52:
            r4 = move-exception
            goto L6f
        L54:
            r4 = move-exception
        L55:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r4 = move-exception
            r4.printStackTrace()
        L62:
            r0.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r4 = move-exception
            r4.printStackTrace()
        L6a:
            byte[] r4 = r0.toByteArray()
            return r4
        L6f:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.io.IOException -> L75
            goto L79
        L75:
            r1 = move-exception
            r1.printStackTrace()
        L79:
            r0.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r0 = move-exception
            r0.printStackTrace()
        L81:
            throw r4
    }

    public static androidx.work.BackoffPolicy intToBackoffPolicy(int r3) {
            if (r3 == 0) goto L24
            r0 = 1
            if (r3 != r0) goto L8
            androidx.work.BackoffPolicy r3 = androidx.work.BackoffPolicy.LINEAR
            return r3
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to BackoffPolicy"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L24:
            androidx.work.BackoffPolicy r3 = androidx.work.BackoffPolicy.EXPONENTIAL
            return r3
    }

    public static androidx.work.NetworkType intToNetworkType(int r3) {
            if (r3 == 0) goto L42
            r0 = 1
            if (r3 == r0) goto L3f
            r0 = 2
            if (r3 == r0) goto L3c
            r0 = 3
            if (r3 == r0) goto L39
            r0 = 4
            if (r3 == r0) goto L36
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1a
            r0 = 5
            if (r3 != r0) goto L1a
            androidx.work.NetworkType r3 = androidx.work.NetworkType.TEMPORARILY_UNMETERED
            return r3
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to NetworkType"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L36:
            androidx.work.NetworkType r3 = androidx.work.NetworkType.METERED
            return r3
        L39:
            androidx.work.NetworkType r3 = androidx.work.NetworkType.NOT_ROAMING
            return r3
        L3c:
            androidx.work.NetworkType r3 = androidx.work.NetworkType.UNMETERED
            return r3
        L3f:
            androidx.work.NetworkType r3 = androidx.work.NetworkType.CONNECTED
            return r3
        L42:
            androidx.work.NetworkType r3 = androidx.work.NetworkType.NOT_REQUIRED
            return r3
    }

    public static androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy(int r3) {
            if (r3 == 0) goto L24
            r0 = 1
            if (r3 != r0) goto L8
            androidx.work.OutOfQuotaPolicy r3 = androidx.work.OutOfQuotaPolicy.DROP_WORK_REQUEST
            return r3
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to OutOfQuotaPolicy"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L24:
            androidx.work.OutOfQuotaPolicy r3 = androidx.work.OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            return r3
    }

    public static androidx.work.WorkInfo.State intToState(int r3) {
            if (r3 == 0) goto L3c
            r0 = 1
            if (r3 == r0) goto L39
            r0 = 2
            if (r3 == r0) goto L36
            r0 = 3
            if (r3 == r0) goto L33
            r0 = 4
            if (r3 == r0) goto L30
            r0 = 5
            if (r3 != r0) goto L14
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.CANCELLED
            return r3
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to State"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L30:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.BLOCKED
            return r3
        L33:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.FAILED
            return r3
        L36:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.SUCCEEDED
            return r3
        L39:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.RUNNING
            return r3
        L3c:
            androidx.work.WorkInfo$State r3 = androidx.work.WorkInfo.State.ENQUEUED
            return r3
    }

    public static int networkTypeToInt(androidx.work.NetworkType r3) {
            int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$NetworkType
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L42
            r2 = 2
            if (r0 == r2) goto L41
            r1 = 3
            if (r0 == r1) goto L40
            r2 = 4
            if (r0 == r2) goto L3f
            r1 = 5
            if (r0 == r1) goto L3e
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L22
            androidx.work.NetworkType r0 = androidx.work.NetworkType.TEMPORARILY_UNMETERED
            if (r3 != r0) goto L22
            return r1
        L22:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to int"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3e:
            return r2
        L3f:
            return r1
        L40:
            return r2
        L41:
            return r1
        L42:
            r3 = 0
            return r3
    }

    public static int outOfQuotaPolicyToInt(androidx.work.OutOfQuotaPolicy r3) {
            int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$OutOfQuotaPolicy
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2b
            r2 = 2
            if (r0 != r2) goto Lf
            return r1
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to int"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L2b:
            r3 = 0
            return r3
    }

    public static int stateToInt(androidx.work.WorkInfo.State r3) {
            int[] r0 = androidx.work.impl.model.WorkTypeConverters.AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L31;
                case 2: goto L2f;
                case 3: goto L2d;
                case 4: goto L2b;
                case 5: goto L29;
                case 6: goto L27;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not convert "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " to int"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            r3 = 5
            return r3
        L29:
            r3 = 4
            return r3
        L2b:
            r3 = 3
            return r3
        L2d:
            r3 = 2
            return r3
        L2f:
            r3 = 1
            return r3
        L31:
            r3 = 0
            return r3
    }
}
