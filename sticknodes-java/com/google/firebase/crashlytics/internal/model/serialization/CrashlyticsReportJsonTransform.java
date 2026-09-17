package com.google.firebase.crashlytics.internal.model.serialization;

/* loaded from: classes2.dex */
public class CrashlyticsReportJsonTransform {
    private static final com.google.firebase.encoders.DataEncoder CRASHLYTICS_REPORT_JSON_ENCODER = null;

    private interface ObjectParser<T> {
        T parse(android.util.JsonReader r1) throws java.io.IOException;
    }

    /* renamed from: $r8$lambda$-MbNjt6enh3_27IyELZga1lBRnE, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event m56$r8$lambda$MbNjt6enh3_27IyELZga1lBRnE(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r0 = parseEvent(r0)
            return r0
    }

    /* renamed from: $r8$lambda$-T1LvqD4bqY3uVE5QE8T26E_vvI, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment m57$r8$lambda$T1LvqD4bqY3uVE5QE8T26E_vvI(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment r0 = parseEventRolloutsAssignment(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch $r8$lambda$2Lh29PKbNCwiykgMPcawbGNyEIQ(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch r0 = parseBuildIdMappingForArch(r0)
            return r0
    }

    /* renamed from: $r8$lambda$4s8CoJuYX6GniCnSQ9blv-x0UAE, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame m58$r8$lambda$4s8CoJuYX6GniCnSQ9blvx0UAE(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r0 = parseEventFrame(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails $r8$lambda$9ah6aN1Q0yIlgljarTsqQ6P3utY(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r0 = parseProcessDetails(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread $r8$lambda$GuwJSqrRyOux7gdIs2hcasuwZyE(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread r0 = parseEventThread(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File $r8$lambda$gtp7HVGCmfilv97Jnlfp7uKMByE(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r0 = parseFile(r0)
            return r0
    }

    /* renamed from: $r8$lambda$hVOu-kNYq4tUb1ixgTLpG9DeCdc, reason: not valid java name */
    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage m59$r8$lambda$hVOukNYq4tUb1ixgTLpG9DeCdc(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage r0 = parseEventBinaryImage(r0)
            return r0
    }

    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute $r8$lambda$xcqRtqatafHDts0kwSCvKzZoURs(android.util.JsonReader r0) {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute r0 = parseCustomAttribute(r0)
            return r0
    }

    static {
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = new com.google.firebase.encoders.json.JsonDataEncoderBuilder
            r0.<init>()
            com.google.firebase.encoders.config.Configurator r1 = com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder.CONFIG
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = r0.configureWith(r1)
            r1 = 1
            com.google.firebase.encoders.json.JsonDataEncoderBuilder r0 = r0.ignoreNullValues(r1)
            com.google.firebase.encoders.DataEncoder r0 = r0.build()
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.CRASHLYTICS_REPORT_JSON_ENCODER = r0
            return
    }

    public CrashlyticsReportJsonTransform() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application parseApp(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L97
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1618432855: goto L54;
                case -519438642: goto L49;
                case 213652010: goto L3e;
                case 351608024: goto L33;
                case 719853845: goto L28;
                case 1975623094: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L5e
        L1d:
            java.lang.String r3 = "displayVersion"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L5e
        L26:
            r2 = 5
            goto L5e
        L28:
            java.lang.String r3 = "installationUuid"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L5e
        L31:
            r2 = 4
            goto L5e
        L33:
            java.lang.String r3 = "version"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L5e
        L3c:
            r2 = 3
            goto L5e
        L3e:
            java.lang.String r3 = "developmentPlatformVersion"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L5e
        L47:
            r2 = 2
            goto L5e
        L49:
            java.lang.String r3 = "developmentPlatform"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L5e
        L52:
            r2 = 1
            goto L5e
        L54:
            java.lang.String r3 = "identifier"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            switch(r2) {
                case 0: goto L8e;
                case 1: goto L85;
                case 2: goto L7d;
                case 3: goto L75;
                case 4: goto L6d;
                case 5: goto L65;
                default: goto L61;
            }
        L61:
            r4.skipValue()
            goto L7
        L65:
            java.lang.String r1 = r4.nextString()
            r0.setDisplayVersion(r1)
            goto L7
        L6d:
            java.lang.String r1 = r4.nextString()
            r0.setInstallationUuid(r1)
            goto L7
        L75:
            java.lang.String r1 = r4.nextString()
            r0.setVersion(r1)
            goto L7
        L7d:
            java.lang.String r1 = r4.nextString()
            r0.setDevelopmentPlatformVersion(r1)
            goto L7
        L85:
            java.lang.String r1 = r4.nextString()
            r0.setDevelopmentPlatform(r1)
            goto L7
        L8e:
            java.lang.String r1 = r4.nextString()
            r0.setIdentifier(r1)
            goto L7
        L97:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo parseAppExitInfo(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lde
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1516200806: goto L79;
                case 110987: goto L6e;
                case 111312: goto L63;
                case 113234: goto L58;
                case 55126294: goto L4d;
                case 202325402: goto L42;
                case 722137681: goto L37;
                case 723857505: goto L2c;
                case 2125650548: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L83
        L1e:
            java.lang.String r3 = "importance"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L28
            goto L83
        L28:
            r2 = 8
            goto L83
        L2c:
            java.lang.String r3 = "traceFile"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L35
            goto L83
        L35:
            r2 = 7
            goto L83
        L37:
            java.lang.String r3 = "reasonCode"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L40
            goto L83
        L40:
            r2 = 6
            goto L83
        L42:
            java.lang.String r3 = "processName"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4b
            goto L83
        L4b:
            r2 = 5
            goto L83
        L4d:
            java.lang.String r3 = "timestamp"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L56
            goto L83
        L56:
            r2 = 4
            goto L83
        L58:
            java.lang.String r3 = "rss"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L61
            goto L83
        L61:
            r2 = 3
            goto L83
        L63:
            java.lang.String r3 = "pss"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6c
            goto L83
        L6c:
            r2 = 2
            goto L83
        L6e:
            java.lang.String r3 = "pid"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L77
            goto L83
        L77:
            r2 = 1
            goto L83
        L79:
            java.lang.String r3 = "buildIdMappingForArch"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            switch(r2) {
                case 0: goto Ld3;
                case 1: goto Lca;
                case 2: goto Lc1;
                case 3: goto Lb8;
                case 4: goto Laf;
                case 5: goto La6;
                case 6: goto L9d;
                case 7: goto L94;
                case 8: goto L8b;
                default: goto L86;
            }
        L86:
            r4.skipValue()
            goto L7
        L8b:
            int r1 = r4.nextInt()
            r0.setImportance(r1)
            goto L7
        L94:
            java.lang.String r1 = r4.nextString()
            r0.setTraceFile(r1)
            goto L7
        L9d:
            int r1 = r4.nextInt()
            r0.setReasonCode(r1)
            goto L7
        La6:
            java.lang.String r1 = r4.nextString()
            r0.setProcessName(r1)
            goto L7
        Laf:
            long r1 = r4.nextLong()
            r0.setTimestamp(r1)
            goto L7
        Lb8:
            long r1 = r4.nextLong()
            r0.setRss(r1)
            goto L7
        Lc1:
            long r1 = r4.nextLong()
            r0.setPss(r1)
            goto L7
        Lca:
            int r1 = r4.nextInt()
            r0.setPid(r1)
            goto L7
        Ld3:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda2 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda2.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setBuildIdMappingForArch(r1)
            goto L7
        Lde:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r4 = r0.build()
            return r4
    }

    private static <T> java.util.List<T> parseArray(android.util.JsonReader r2, com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.ObjectParser<T> r3) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.beginArray()
        L8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.parse(r2)
            r0.add(r1)
            goto L8
        L16:
            r2.endArray()
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)
            return r2
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch parseBuildIdMappingForArch(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5c
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -609862170: goto L33;
                case 3002454: goto L28;
                case 230943785: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L3d
        L1d:
            java.lang.String r3 = "buildId"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L3d
        L26:
            r2 = 2
            goto L3d
        L28:
            java.lang.String r3 = "arch"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L3d
        L31:
            r2 = 1
            goto L3d
        L33:
            java.lang.String r3 = "libraryName"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = 0
        L3d:
            switch(r2) {
                case 0: goto L54;
                case 1: goto L4c;
                case 2: goto L44;
                default: goto L40;
            }
        L40:
            r4.skipValue()
            goto L7
        L44:
            java.lang.String r1 = r4.nextString()
            r0.setBuildId(r1)
            goto L7
        L4c:
            java.lang.String r1 = r4.nextString()
            r0.setArch(r1)
            goto L7
        L54:
            java.lang.String r1 = r4.nextString()
            r0.setLibraryName(r1)
            goto L7
        L5c:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo$BuildIdMappingForArch r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute parseCustomAttribute(android.util.JsonReader r3) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.builder()
            r3.beginObject()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.String r1 = r3.nextName()
            r1.hashCode()
            java.lang.String r2 = "key"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "value"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            r3.skipValue()
            goto L7
        L28:
            java.lang.String r1 = r3.nextString()
            r0.setValue(r1)
            goto L7
        L30:
            java.lang.String r1 = r3.nextString()
            r0.setKey(r1)
            goto L7
        L38:
            r3.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$CustomAttribute r3 = r0.build()
            return r3
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device parseDevice(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Ldc
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1981332476: goto L79;
                case -1969347631: goto L6e;
                case 112670: goto L63;
                case 3002454: goto L58;
                case 81784169: goto L4d;
                case 94848180: goto L42;
                case 104069929: goto L37;
                case 109757585: goto L2c;
                case 2078953423: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto L83
        L1e:
            java.lang.String r3 = "modelClass"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L28
            goto L83
        L28:
            r2 = 8
            goto L83
        L2c:
            java.lang.String r3 = "state"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L35
            goto L83
        L35:
            r2 = 7
            goto L83
        L37:
            java.lang.String r3 = "model"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L40
            goto L83
        L40:
            r2 = 6
            goto L83
        L42:
            java.lang.String r3 = "cores"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L4b
            goto L83
        L4b:
            r2 = 5
            goto L83
        L4d:
            java.lang.String r3 = "diskSpace"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L56
            goto L83
        L56:
            r2 = 4
            goto L83
        L58:
            java.lang.String r3 = "arch"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L61
            goto L83
        L61:
            r2 = 3
            goto L83
        L63:
            java.lang.String r3 = "ram"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6c
            goto L83
        L6c:
            r2 = 2
            goto L83
        L6e:
            java.lang.String r3 = "manufacturer"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L77
            goto L83
        L77:
            r2 = 1
            goto L83
        L79:
            java.lang.String r3 = "simulator"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            switch(r2) {
                case 0: goto Ld3;
                case 1: goto Lca;
                case 2: goto Lc1;
                case 3: goto Lb8;
                case 4: goto Laf;
                case 5: goto La6;
                case 6: goto L9d;
                case 7: goto L94;
                case 8: goto L8b;
                default: goto L86;
            }
        L86:
            r4.skipValue()
            goto L7
        L8b:
            java.lang.String r1 = r4.nextString()
            r0.setModelClass(r1)
            goto L7
        L94:
            int r1 = r4.nextInt()
            r0.setState(r1)
            goto L7
        L9d:
            java.lang.String r1 = r4.nextString()
            r0.setModel(r1)
            goto L7
        La6:
            int r1 = r4.nextInt()
            r0.setCores(r1)
            goto L7
        Laf:
            long r1 = r4.nextLong()
            r0.setDiskSpace(r1)
            goto L7
        Lb8:
            int r1 = r4.nextInt()
            r0.setArch(r1)
            goto L7
        Lc1:
            long r1 = r4.nextLong()
            r0.setRam(r1)
            goto L7
        Lca:
            java.lang.String r1 = r4.nextString()
            r0.setManufacturer(r1)
            goto L7
        Ld3:
            boolean r1 = r4.nextBoolean()
            r0.setSimulator(r1)
            goto L7
        Ldc:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event parseEvent(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L97
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1335157162: goto L54;
                case -259312414: goto L49;
                case 96801: goto L3e;
                case 107332: goto L33;
                case 3575610: goto L28;
                case 55126294: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L5e
        L1d:
            java.lang.String r3 = "timestamp"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L5e
        L26:
            r2 = 5
            goto L5e
        L28:
            java.lang.String r3 = "type"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L5e
        L31:
            r2 = 4
            goto L5e
        L33:
            java.lang.String r3 = "log"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L5e
        L3c:
            r2 = 3
            goto L5e
        L3e:
            java.lang.String r3 = "app"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L5e
        L47:
            r2 = 2
            goto L5e
        L49:
            java.lang.String r3 = "rollouts"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L5e
        L52:
            r2 = 1
            goto L5e
        L54:
            java.lang.String r3 = "device"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            switch(r2) {
                case 0: goto L8e;
                case 1: goto L85;
                case 2: goto L7d;
                case 3: goto L75;
                case 4: goto L6d;
                case 5: goto L65;
                default: goto L61;
            }
        L61:
            r4.skipValue()
            goto L7
        L65:
            long r1 = r4.nextLong()
            r0.setTimestamp(r1)
            goto L7
        L6d:
            java.lang.String r1 = r4.nextString()
            r0.setType(r1)
            goto L7
        L75:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r1 = parseEventLog(r4)
            r0.setLog(r1)
            goto L7
        L7d:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r1 = parseEventApp(r4)
            r0.setApp(r1)
            goto L7
        L85:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r1 = parseEventRolloutsState(r4)
            r0.setRollouts(r1)
            goto L7
        L8e:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r1 = parseEventDevice(r4)
            r0.setDevice(r1)
            goto L7
        L97:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application parseEventApp(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1405314732: goto L5f;
                case -1332194002: goto L54;
                case -1090974952: goto L49;
                case -80231855: goto L3e;
                case 555169704: goto L33;
                case 928737948: goto L28;
                case 1847730860: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L69
        L1d:
            java.lang.String r3 = "currentProcessDetails"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L69
        L26:
            r2 = 6
            goto L69
        L28:
            java.lang.String r3 = "uiOrientation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L69
        L31:
            r2 = 5
            goto L69
        L33:
            java.lang.String r3 = "customAttributes"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L69
        L3c:
            r2 = 4
            goto L69
        L3e:
            java.lang.String r3 = "internalKeys"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L69
        L47:
            r2 = 3
            goto L69
        L49:
            java.lang.String r3 = "execution"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L69
        L52:
            r2 = 2
            goto L69
        L54:
            java.lang.String r3 = "background"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5d
            goto L69
        L5d:
            r2 = 1
            goto L69
        L5f:
            java.lang.String r3 = "appProcessDetails"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto L9f;
                case 2: goto L96;
                case 3: goto L8b;
                case 4: goto L80;
                case 5: goto L78;
                case 6: goto L70;
                default: goto L6c;
            }
        L6c:
            r4.skipValue()
            goto L7
        L70:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r1 = parseProcessDetails(r4)
            r0.setCurrentProcessDetails(r1)
            goto L7
        L78:
            int r1 = r4.nextInt()
            r0.setUiOrientation(r1)
            goto L7
        L80:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda8 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda8.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setCustomAttributes(r1)
            goto L7
        L8b:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda8 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda8.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setInternalKeys(r1)
            goto L7
        L96:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r1 = parseEventExecution(r4)
            r0.setExecution(r1)
            goto L7
        L9f:
            boolean r1 = r4.nextBoolean()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setBackground(r1)
            goto L7
        Lac:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda4.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setAppProcessDetails(r1)
            goto L7
        Lb7:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage parseEventBinaryImage(android.util.JsonReader r5) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.builder()
            r5.beginObject()
        L7:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L74
            java.lang.String r1 = r5.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 2
            switch(r3) {
                case 3373707: goto L3f;
                case 3530753: goto L34;
                case 3601339: goto L29;
                case 1153765347: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L49
        L1e:
            java.lang.String r3 = "baseAddress"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27
            goto L49
        L27:
            r2 = 3
            goto L49
        L29:
            java.lang.String r3 = "uuid"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L32
            goto L49
        L32:
            r2 = 2
            goto L49
        L34:
            java.lang.String r3 = "size"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3d
            goto L49
        L3d:
            r2 = 1
            goto L49
        L3f:
            java.lang.String r3 = "name"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L48
            goto L49
        L48:
            r2 = 0
        L49:
            switch(r2) {
                case 0: goto L6c;
                case 1: goto L64;
                case 2: goto L58;
                case 3: goto L50;
                default: goto L4c;
            }
        L4c:
            r5.skipValue()
            goto L7
        L50:
            long r1 = r5.nextLong()
            r0.setBaseAddress(r1)
            goto L7
        L58:
            java.lang.String r1 = r5.nextString()
            byte[] r1 = android.util.Base64.decode(r1, r4)
            r0.setUuidFromUtf8Bytes(r1)
            goto L7
        L64:
            long r1 = r5.nextLong()
            r0.setSize(r1)
            goto L7
        L6c:
            java.lang.String r1 = r5.nextString()
            r0.setName(r1)
            goto L7
        L74:
            r5.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage r5 = r0.build()
            return r5
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device parseEventDevice(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L9b
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1708606089: goto L54;
                case -1455558134: goto L49;
                case -1439500848: goto L3e;
                case 279795450: goto L33;
                case 976541947: goto L28;
                case 1516795582: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L5e
        L1d:
            java.lang.String r3 = "proximityOn"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L5e
        L26:
            r2 = 5
            goto L5e
        L28:
            java.lang.String r3 = "ramUsed"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L5e
        L31:
            r2 = 4
            goto L5e
        L33:
            java.lang.String r3 = "diskUsed"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L5e
        L3c:
            r2 = 3
            goto L5e
        L3e:
            java.lang.String r3 = "orientation"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L5e
        L47:
            r2 = 2
            goto L5e
        L49:
            java.lang.String r3 = "batteryVelocity"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L5e
        L52:
            r2 = 1
            goto L5e
        L54:
            java.lang.String r3 = "batteryLevel"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            switch(r2) {
                case 0: goto L8e;
                case 1: goto L85;
                case 2: goto L7d;
                case 3: goto L75;
                case 4: goto L6d;
                case 5: goto L65;
                default: goto L61;
            }
        L61:
            r4.skipValue()
            goto L7
        L65:
            boolean r1 = r4.nextBoolean()
            r0.setProximityOn(r1)
            goto L7
        L6d:
            long r1 = r4.nextLong()
            r0.setRamUsed(r1)
            goto L7
        L75:
            long r1 = r4.nextLong()
            r0.setDiskUsed(r1)
            goto L7
        L7d:
            int r1 = r4.nextInt()
            r0.setOrientation(r1)
            goto L7
        L85:
            int r1 = r4.nextInt()
            r0.setBatteryVelocity(r1)
            goto L7
        L8e:
            double r1 = r4.nextDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.setBatteryLevel(r1)
            goto L7
        L9b:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution parseEventExecution(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L86
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1375141843: goto L49;
                case -1337936983: goto L3e;
                case -902467928: goto L33;
                case 937615455: goto L28;
                case 1481625679: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L53
        L1d:
            java.lang.String r3 = "exception"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L53
        L26:
            r2 = 4
            goto L53
        L28:
            java.lang.String r3 = "binaries"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L53
        L31:
            r2 = 3
            goto L53
        L33:
            java.lang.String r3 = "signal"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L53
        L3c:
            r2 = 2
            goto L53
        L3e:
            java.lang.String r3 = "threads"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L53
        L47:
            r2 = 1
            goto L53
        L49:
            java.lang.String r3 = "appExitInfo"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L53
        L52:
            r2 = 0
        L53:
            switch(r2) {
                case 0: goto L7e;
                case 1: goto L74;
                case 2: goto L6c;
                case 3: goto L62;
                case 4: goto L5a;
                default: goto L56;
            }
        L56:
            r4.skipValue()
            goto L7
        L5a:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = parseEventExecutionException(r4)
            r0.setException(r1)
            goto L7
        L62:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda7 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda7.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setBinaries(r1)
            goto L7
        L6c:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r1 = parseEventSignal(r4)
            r0.setSignal(r1)
            goto L7
        L74:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda5.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setThreads(r1)
            goto L7
        L7e:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = parseAppExitInfo(r4)
            r0.setAppExitInfo(r1)
            goto L7
        L86:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception parseEventExecutionException(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L84
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1266514778: goto L49;
                case -934964668: goto L3e;
                case 3575610: goto L33;
                case 91997906: goto L28;
                case 581754413: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L53
        L1d:
            java.lang.String r3 = "overflowCount"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L53
        L26:
            r2 = 4
            goto L53
        L28:
            java.lang.String r3 = "causedBy"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L53
        L31:
            r2 = 3
            goto L53
        L33:
            java.lang.String r3 = "type"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L53
        L3c:
            r2 = 2
            goto L53
        L3e:
            java.lang.String r3 = "reason"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L53
        L47:
            r2 = 1
            goto L53
        L49:
            java.lang.String r3 = "frames"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L53
        L52:
            r2 = 0
        L53:
            switch(r2) {
                case 0: goto L7a;
                case 1: goto L72;
                case 2: goto L6a;
                case 3: goto L62;
                case 4: goto L5a;
                default: goto L56;
            }
        L56:
            r4.skipValue()
            goto L7
        L5a:
            int r1 = r4.nextInt()
            r0.setOverflowCount(r1)
            goto L7
        L62:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r1 = parseEventExecutionException(r4)
            r0.setCausedBy(r1)
            goto L7
        L6a:
            java.lang.String r1 = r4.nextString()
            r0.setType(r1)
            goto L7
        L72:
            java.lang.String r1 = r4.nextString()
            r0.setReason(r1)
            goto L7
        L7a:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda3 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda3.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setFrames(r1)
            goto L7
        L84:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Exception r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame parseEventFrame(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L82
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1019779949: goto L49;
                case -887523944: goto L3e;
                case 3571: goto L33;
                case 3143036: goto L28;
                case 2125650548: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L53
        L1d:
            java.lang.String r3 = "importance"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L53
        L26:
            r2 = 4
            goto L53
        L28:
            java.lang.String r3 = "file"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L53
        L31:
            r2 = 3
            goto L53
        L33:
            java.lang.String r3 = "pc"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L53
        L3c:
            r2 = 2
            goto L53
        L3e:
            java.lang.String r3 = "symbol"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L53
        L47:
            r2 = 1
            goto L53
        L49:
            java.lang.String r3 = "offset"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto L53
        L52:
            r2 = 0
        L53:
            switch(r2) {
                case 0: goto L7a;
                case 1: goto L72;
                case 2: goto L6a;
                case 3: goto L62;
                case 4: goto L5a;
                default: goto L56;
            }
        L56:
            r4.skipValue()
            goto L7
        L5a:
            int r1 = r4.nextInt()
            r0.setImportance(r1)
            goto L7
        L62:
            java.lang.String r1 = r4.nextString()
            r0.setFile(r1)
            goto L7
        L6a:
            long r1 = r4.nextLong()
            r0.setPc(r1)
            goto L7
        L72:
            java.lang.String r1 = r4.nextString()
            r0.setSymbol(r1)
            goto L7
        L7a:
            long r1 = r4.nextLong()
            r0.setOffset(r1)
            goto L7
        L82:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Frame r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log parseEventLog(android.util.JsonReader r3) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.builder()
            r3.beginObject()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.String r1 = r3.nextName()
            java.lang.String r2 = "content"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            java.lang.String r1 = r3.nextString()
            r0.setContent(r1)
            goto L7
        L21:
            r3.skipValue()
            goto L7
        L25:
            r3.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Log r3 = r0.build()
            return r3
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment parseEventRolloutsAssignment(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L6f
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1536268810: goto L3e;
                case -1027290370: goto L33;
                case 1098747284: goto L28;
                case 1124454216: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L48
        L1d:
            java.lang.String r3 = "parameterValue"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L48
        L26:
            r2 = 3
            goto L48
        L28:
            java.lang.String r3 = "rolloutVariant"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L48
        L31:
            r2 = 2
            goto L48
        L33:
            java.lang.String r3 = "templateVersion"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L48
        L3c:
            r2 = 1
            goto L48
        L3e:
            java.lang.String r3 = "parameterKey"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            switch(r2) {
                case 0: goto L67;
                case 1: goto L5f;
                case 2: goto L57;
                case 3: goto L4f;
                default: goto L4b;
            }
        L4b:
            r4.skipValue()
            goto L7
        L4f:
            java.lang.String r1 = r4.nextString()
            r0.setParameterValue(r1)
            goto L7
        L57:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r1 = parseRolloutAssignmentRolloutVariant(r4)
            r0.setRolloutVariant(r1)
            goto L7
        L5f:
            long r1 = r4.nextLong()
            r0.setTemplateVersion(r1)
            goto L7
        L67:
            java.lang.String r1 = r4.nextString()
            r0.setParameterKey(r1)
            goto L7
        L6f:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState parseEventRolloutsState(android.util.JsonReader r3) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.builder()
            r3.beginObject()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.String r1 = r3.nextName()
            r1.hashCode()
            java.lang.String r2 = "assignments"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L20
            r3.skipValue()
            goto L7
        L20:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda1 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda1.INSTANCE
            java.util.List r1 = parseArray(r3, r1)
            r0.setRolloutAssignments(r1)
            goto L7
        L2a:
            r3.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutsState r3 = r0.build()
            return r3
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal parseEventSignal(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5c
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1147692044: goto L33;
                case 3059181: goto L28;
                case 3373707: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L3d
        L1d:
            java.lang.String r3 = "name"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L3d
        L26:
            r2 = 2
            goto L3d
        L28:
            java.lang.String r3 = "code"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L3d
        L31:
            r2 = 1
            goto L3d
        L33:
            java.lang.String r3 = "address"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = 0
        L3d:
            switch(r2) {
                case 0: goto L54;
                case 1: goto L4c;
                case 2: goto L44;
                default: goto L40;
            }
        L40:
            r4.skipValue()
            goto L7
        L44:
            java.lang.String r1 = r4.nextString()
            r0.setName(r1)
            goto L7
        L4c:
            java.lang.String r1 = r4.nextString()
            r0.setCode(r1)
            goto L7
        L54:
            long r1 = r4.nextLong()
            r0.setAddress(r1)
            goto L7
        L5c:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Signal r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread parseEventThread(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L5e
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -1266514778: goto L33;
                case 3373707: goto L28;
                case 2125650548: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L3d
        L1d:
            java.lang.String r3 = "importance"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L3d
        L26:
            r2 = 2
            goto L3d
        L28:
            java.lang.String r3 = "name"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L3d
        L31:
            r2 = 1
            goto L3d
        L33:
            java.lang.String r3 = "frames"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = 0
        L3d:
            switch(r2) {
                case 0: goto L54;
                case 1: goto L4c;
                case 2: goto L44;
                default: goto L40;
            }
        L40:
            r4.skipValue()
            goto L7
        L44:
            int r1 = r4.nextInt()
            r0.setImportance(r1)
            goto L7
        L4c:
            java.lang.String r1 = r4.nextString()
            r0.setName(r1)
            goto L7
        L54:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda3 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda3.INSTANCE
            java.util.List r1 = parseArray(r4, r1)
            r0.setFrames(r1)
            goto L7
        L5e:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$Thread r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File parseFile(android.util.JsonReader r3) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder()
            r3.beginObject()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3d
            java.lang.String r1 = r3.nextName()
            r1.hashCode()
            java.lang.String r2 = "filename"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L35
            java.lang.String r2 = "contents"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            r3.skipValue()
            goto L7
        L28:
            java.lang.String r1 = r3.nextString()
            r2 = 2
            byte[] r1 = android.util.Base64.decode(r1, r2)
            r0.setContents(r1)
            goto L7
        L35:
            java.lang.String r1 = r3.nextString()
            r0.setFilename(r1)
            goto L7
        L3d:
            r3.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$File r3 = r0.build()
            return r3
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload parseNdkPayload(android.util.JsonReader r3) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.builder()
            r3.beginObject()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3a
            java.lang.String r1 = r3.nextName()
            r1.hashCode()
            java.lang.String r2 = "files"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "orgId"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            r3.skipValue()
            goto L7
        L28:
            java.lang.String r1 = r3.nextString()
            r0.setOrgId(r1)
            goto L7
        L30:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda6 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda6.INSTANCE
            java.util.List r1 = parseArray(r3, r1)
            r0.setFiles(r1)
            goto L7
        L3a:
            r3.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r3 = r0.build()
            return r3
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem parseOs(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L6f
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -911706486: goto L3e;
                case -293026577: goto L33;
                case 351608024: goto L28;
                case 1874684019: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L48
        L1d:
            java.lang.String r3 = "platform"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L48
        L26:
            r2 = 3
            goto L48
        L28:
            java.lang.String r3 = "version"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L48
        L31:
            r2 = 2
            goto L48
        L33:
            java.lang.String r3 = "jailbroken"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L48
        L3c:
            r2 = 1
            goto L48
        L3e:
            java.lang.String r3 = "buildVersion"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            switch(r2) {
                case 0: goto L67;
                case 1: goto L5f;
                case 2: goto L57;
                case 3: goto L4f;
                default: goto L4b;
            }
        L4b:
            r4.skipValue()
            goto L7
        L4f:
            int r1 = r4.nextInt()
            r0.setPlatform(r1)
            goto L7
        L57:
            java.lang.String r1 = r4.nextString()
            r0.setVersion(r1)
            goto L7
        L5f:
            boolean r1 = r4.nextBoolean()
            r0.setJailbroken(r1)
            goto L7
        L67:
            java.lang.String r1 = r4.nextString()
            r0.setBuildVersion(r1)
            goto L7
        L6f:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails parseProcessDetails(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L6f
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case 110987: goto L3e;
                case 202325402: goto L33;
                case 1694598382: goto L28;
                case 2125650548: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L48
        L1d:
            java.lang.String r3 = "importance"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L26
            goto L48
        L26:
            r2 = 3
            goto L48
        L28:
            java.lang.String r3 = "defaultProcess"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L31
            goto L48
        L31:
            r2 = 2
            goto L48
        L33:
            java.lang.String r3 = "processName"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L3c
            goto L48
        L3c:
            r2 = 1
            goto L48
        L3e:
            java.lang.String r3 = "pid"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L47
            goto L48
        L47:
            r2 = 0
        L48:
            switch(r2) {
                case 0: goto L67;
                case 1: goto L5f;
                case 2: goto L57;
                case 3: goto L4f;
                default: goto L4b;
            }
        L4b:
            r4.skipValue()
            goto L7
        L4f:
            int r1 = r4.nextInt()
            r0.setImportance(r1)
            goto L7
        L57:
            boolean r1 = r4.nextBoolean()
            r0.setDefaultProcess(r1)
            goto L7
        L5f:
            java.lang.String r1 = r4.nextString()
            r0.setProcessName(r1)
            goto L7
        L67:
            int r1 = r4.nextInt()
            r0.setPid(r1)
            goto L7
        L6f:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$ProcessDetails r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport parseReport(android.util.JsonReader r4) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.builder()
            r4.beginObject()
        L7:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L121
            java.lang.String r1 = r4.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            switch(r3) {
                case -2118372775: goto La3;
                case -1962630338: goto L98;
                case -1907185581: goto L8d;
                case -1375141843: goto L82;
                case -911706486: goto L77;
                case -401988390: goto L6c;
                case 344431858: goto L61;
                case 719853845: goto L56;
                case 1047652060: goto L48;
                case 1874684019: goto L3a;
                case 1975623094: goto L2c;
                case 1984987798: goto L1e;
                default: goto L1c;
            }
        L1c:
            goto Lad
        L1e:
            java.lang.String r3 = "session"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L28
            goto Lad
        L28:
            r2 = 11
            goto Lad
        L2c:
            java.lang.String r3 = "displayVersion"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L36
            goto Lad
        L36:
            r2 = 10
            goto Lad
        L3a:
            java.lang.String r3 = "platform"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L44
            goto Lad
        L44:
            r2 = 9
            goto Lad
        L48:
            java.lang.String r3 = "firebaseInstallationId"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L52
            goto Lad
        L52:
            r2 = 8
            goto Lad
        L56:
            java.lang.String r3 = "installationUuid"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L5f
            goto Lad
        L5f:
            r2 = 7
            goto Lad
        L61:
            java.lang.String r3 = "gmpAppId"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6a
            goto Lad
        L6a:
            r2 = 6
            goto Lad
        L6c:
            java.lang.String r3 = "firebaseAuthenticationToken"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L75
            goto Lad
        L75:
            r2 = 5
            goto Lad
        L77:
            java.lang.String r3 = "buildVersion"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L80
            goto Lad
        L80:
            r2 = 4
            goto Lad
        L82:
            java.lang.String r3 = "appExitInfo"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L8b
            goto Lad
        L8b:
            r2 = 3
            goto Lad
        L8d:
            java.lang.String r3 = "appQualitySessionId"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L96
            goto Lad
        L96:
            r2 = 2
            goto Lad
        L98:
            java.lang.String r3 = "sdkVersion"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto La1
            goto Lad
        La1:
            r2 = 1
            goto Lad
        La3:
            java.lang.String r3 = "ndkPayload"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lac
            goto Lad
        Lac:
            r2 = 0
        Lad:
            switch(r2) {
                case 0: goto L118;
                case 1: goto L10f;
                case 2: goto L106;
                case 3: goto Lfd;
                case 4: goto Lf4;
                case 5: goto Leb;
                case 6: goto Le2;
                case 7: goto Ld9;
                case 8: goto Ld0;
                case 9: goto Lc7;
                case 10: goto Lbe;
                case 11: goto Lb5;
                default: goto Lb0;
            }
        Lb0:
            r4.skipValue()
            goto L7
        Lb5:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = parseSession(r4)
            r0.setSession(r1)
            goto L7
        Lbe:
            java.lang.String r1 = r4.nextString()
            r0.setDisplayVersion(r1)
            goto L7
        Lc7:
            int r1 = r4.nextInt()
            r0.setPlatform(r1)
            goto L7
        Ld0:
            java.lang.String r1 = r4.nextString()
            r0.setFirebaseInstallationId(r1)
            goto L7
        Ld9:
            java.lang.String r1 = r4.nextString()
            r0.setInstallationUuid(r1)
            goto L7
        Le2:
            java.lang.String r1 = r4.nextString()
            r0.setGmpAppId(r1)
            goto L7
        Leb:
            java.lang.String r1 = r4.nextString()
            r0.setFirebaseAuthenticationToken(r1)
            goto L7
        Lf4:
            java.lang.String r1 = r4.nextString()
            r0.setBuildVersion(r1)
            goto L7
        Lfd:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$ApplicationExitInfo r1 = parseAppExitInfo(r4)
            r0.setAppExitInfo(r1)
            goto L7
        L106:
            java.lang.String r1 = r4.nextString()
            r0.setAppQualitySessionId(r1)
            goto L7
        L10f:
            java.lang.String r1 = r4.nextString()
            r0.setSdkVersion(r1)
            goto L7
        L118:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$FilesPayload r1 = parseNdkPayload(r4)
            r0.setNdkPayload(r1)
            goto L7
        L121:
            r4.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r4 = r0.build()
            return r4
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant parseRolloutAssignmentRolloutVariant(android.util.JsonReader r3) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.builder()
            r3.beginObject()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L38
            java.lang.String r1 = r3.nextName()
            r1.hashCode()
            java.lang.String r2 = "variantId"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L30
            java.lang.String r2 = "rolloutId"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L28
            r3.skipValue()
            goto L7
        L28:
            java.lang.String r1 = r3.nextString()
            r0.setRolloutId(r1)
            goto L7
        L30:
            java.lang.String r1 = r3.nextString()
            r0.setVariantId(r1)
            goto L7
        L38:
            r3.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$RolloutAssignment$RolloutVariant r3 = r0.build()
            return r3
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session parseSession(android.util.JsonReader r5) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.builder()
            r5.beginObject()
        L7:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L12c
            java.lang.String r1 = r5.nextName()
            r1.hashCode()
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 2
            switch(r3) {
                case -2128794476: goto La4;
                case -1907185581: goto L99;
                case -1618432855: goto L8e;
                case -1606742899: goto L83;
                case -1335157162: goto L78;
                case -1291329255: goto L6d;
                case 3556: goto L62;
                case 96801: goto L57;
                case 3599307: goto L49;
                case 286956243: goto L3b;
                case 1025385094: goto L2d;
                case 2047016109: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto Lae
        L1f:
            java.lang.String r3 = "generatorType"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L29
            goto Lae
        L29:
            r2 = 11
            goto Lae
        L2d:
            java.lang.String r3 = "crashed"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L37
            goto Lae
        L37:
            r2 = 10
            goto Lae
        L3b:
            java.lang.String r3 = "generator"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L45
            goto Lae
        L45:
            r2 = 9
            goto Lae
        L49:
            java.lang.String r3 = "user"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L53
            goto Lae
        L53:
            r2 = 8
            goto Lae
        L57:
            java.lang.String r3 = "app"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L60
            goto Lae
        L60:
            r2 = 7
            goto Lae
        L62:
            java.lang.String r3 = "os"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L6b
            goto Lae
        L6b:
            r2 = 6
            goto Lae
        L6d:
            java.lang.String r3 = "events"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L76
            goto Lae
        L76:
            r2 = 5
            goto Lae
        L78:
            java.lang.String r3 = "device"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L81
            goto Lae
        L81:
            r2 = 4
            goto Lae
        L83:
            java.lang.String r3 = "endedAt"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L8c
            goto Lae
        L8c:
            r2 = 3
            goto Lae
        L8e:
            java.lang.String r3 = "identifier"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L97
            goto Lae
        L97:
            r2 = 2
            goto Lae
        L99:
            java.lang.String r3 = "appQualitySessionId"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto La2
            goto Lae
        La2:
            r2 = 1
            goto Lae
        La4:
            java.lang.String r3 = "startedAt"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lad
            goto Lae
        Lad:
            r2 = 0
        Lae:
            switch(r2) {
                case 0: goto L123;
                case 1: goto L11a;
                case 2: goto L10d;
                case 3: goto L100;
                case 4: goto Lf7;
                case 5: goto Lec;
                case 6: goto Le3;
                case 7: goto Lda;
                case 8: goto Ld1;
                case 9: goto Lc8;
                case 10: goto Lbf;
                case 11: goto Lb6;
                default: goto Lb1;
            }
        Lb1:
            r5.skipValue()
            goto L7
        Lb6:
            int r1 = r5.nextInt()
            r0.setGeneratorType(r1)
            goto L7
        Lbf:
            boolean r1 = r5.nextBoolean()
            r0.setCrashed(r1)
            goto L7
        Lc8:
            java.lang.String r1 = r5.nextString()
            r0.setGenerator(r1)
            goto L7
        Ld1:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r1 = parseUser(r5)
            r0.setUser(r1)
            goto L7
        Lda:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Application r1 = parseApp(r5)
            r0.setApp(r1)
            goto L7
        Le3:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$OperatingSystem r1 = parseOs(r5)
            r0.setOs(r1)
            goto L7
        Lec:
            com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda0 r1 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform$$ExternalSyntheticLambda0.INSTANCE
            java.util.List r1 = parseArray(r5, r1)
            r0.setEvents(r1)
            goto L7
        Lf7:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Device r1 = parseDevice(r5)
            r0.setDevice(r1)
            goto L7
        L100:
            long r1 = r5.nextLong()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setEndedAt(r1)
            goto L7
        L10d:
            java.lang.String r1 = r5.nextString()
            byte[] r1 = android.util.Base64.decode(r1, r4)
            r0.setIdentifierFromUtf8Bytes(r1)
            goto L7
        L11a:
            java.lang.String r1 = r5.nextString()
            r0.setAppQualitySessionId(r1)
            goto L7
        L123:
            long r1 = r5.nextLong()
            r0.setStartedAt(r1)
            goto L7
        L12c:
            r5.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r5 = r0.build()
            return r5
    }

    private static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User parseUser(android.util.JsonReader r3) throws java.io.IOException {
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User$Builder r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.builder()
            r3.beginObject()
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.String r1 = r3.nextName()
            java.lang.String r2 = "identifier"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            java.lang.String r1 = r3.nextString()
            r0.setIdentifier(r1)
            goto L7
        L21:
            r3.skipValue()
            goto L7
        L25:
            r3.endObject()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r3 = r0.build()
            return r3
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event eventFromJson(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch: java.lang.IllegalStateException -> L1c
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.IllegalStateException -> L1c
            r1.<init>(r3)     // Catch: java.lang.IllegalStateException -> L1c
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L1c
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event r3 = parseEvent(r0)     // Catch: java.lang.Throwable -> L12
            r0.close()     // Catch: java.lang.IllegalStateException -> L1c
            return r3
        L12:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1c
        L1b:
            throw r3     // Catch: java.lang.IllegalStateException -> L1c
        L1c:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
    }

    public java.lang.String eventToJson(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event r2) {
            r1 = this;
            com.google.firebase.encoders.DataEncoder r0 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.CRASHLYTICS_REPORT_JSON_ENCODER
            java.lang.String r2 = r0.encode(r2)
            return r2
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport reportFromJson(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            android.util.JsonReader r0 = new android.util.JsonReader     // Catch: java.lang.IllegalStateException -> L1c
            java.io.StringReader r1 = new java.io.StringReader     // Catch: java.lang.IllegalStateException -> L1c
            r1.<init>(r3)     // Catch: java.lang.IllegalStateException -> L1c
            r0.<init>(r1)     // Catch: java.lang.IllegalStateException -> L1c
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3 = parseReport(r0)     // Catch: java.lang.Throwable -> L12
            r0.close()     // Catch: java.lang.IllegalStateException -> L1c
            return r3
        L12:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r0 = move-exception
            r3.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1c
        L1b:
            throw r3     // Catch: java.lang.IllegalStateException -> L1c
        L1c:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r3)
            throw r0
    }

    public java.lang.String reportToJson(com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2) {
            r1 = this;
            com.google.firebase.encoders.DataEncoder r0 = com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.CRASHLYTICS_REPORT_JSON_ENCODER
            java.lang.String r2 = r0.encode(r2)
            return r2
    }
}
