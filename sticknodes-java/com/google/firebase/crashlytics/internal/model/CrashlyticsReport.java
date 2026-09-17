package com.google.firebase.crashlytics.internal.model;

@com.google.auto.value.AutoValue
/* loaded from: classes2.dex */
public abstract class CrashlyticsReport {
    private static final java.nio.charset.Charset UTF_8 = null;

    @com.google.auto.value.AutoValue
    public static abstract class ApplicationExitInfo {

        @com.google.auto.value.AutoValue
        public static abstract class BuildIdMappingForArch {

            @com.google.auto.value.AutoValue.Builder
            public static abstract class Builder {
                public Builder() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(java.lang.String r1);
            }

            public BuildIdMappingForArch() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder builder() {
                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch$Builder
                    r0.<init>()
                    return r0
            }

            public abstract java.lang.String getArch();

            public abstract java.lang.String getBuildId();

            public abstract java.lang.String getLibraryName();
        }

        @com.google.auto.value.AutoValue.Builder
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setBuildIdMappingForArch(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setImportance(int r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPid(int r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setProcessName(java.lang.String r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setPss(long r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setReasonCode(int r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setRss(long r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTimestamp(long r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder setTraceFile(java.lang.String r1);
        }

        public ApplicationExitInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.Builder builder() {
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_ApplicationExitInfo$Builder
                r0.<init>()
                return r0
        }

        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> getBuildIdMappingForArch();

        public abstract int getImportance();

        public abstract int getPid();

        public abstract java.lang.String getProcessName();

        public abstract long getPss();

        public abstract int getReasonCode();

        public abstract long getRss();

        public abstract long getTimestamp();

        public abstract java.lang.String getTraceFile();
    }

    @com.google.auto.value.AutoValue.Builder
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport build();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setAppQualitySessionId(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setBuildVersion(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setDisplayVersion(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseAuthenticationToken(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setFirebaseInstallationId(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setGmpAppId(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setInstallationUuid(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setNdkPayload(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setPlatform(int r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSdkVersion(java.lang.String r1);

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder setSession(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session r1);
    }

    @com.google.auto.value.AutoValue
    public static abstract class CustomAttribute {

        @com.google.auto.value.AutoValue.Builder
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setKey(java.lang.String r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder setValue(java.lang.String r1);
        }

        public CustomAttribute() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder builder() {
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_CustomAttribute$Builder
                r0.<init>()
                return r0
        }

        public abstract java.lang.String getKey();

        public abstract java.lang.String getValue();
    }

    @com.google.auto.value.AutoValue
    public static abstract class FilesPayload {

        @com.google.auto.value.AutoValue.Builder
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setFiles(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder setOrgId(java.lang.String r1);
        }

        @com.google.auto.value.AutoValue
        public static abstract class File {

            @com.google.auto.value.AutoValue.Builder
            public static abstract class Builder {
                public Builder() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setContents(byte[] r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder setFilename(java.lang.String r1);
            }

            public File() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder builder() {
                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload_File$Builder
                    r0.<init>()
                    return r0
            }

            public abstract byte[] getContents();

            public abstract java.lang.String getFilename();
        }

        public FilesPayload() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder builder() {
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_FilesPayload$Builder
                r0.<init>()
                return r0
        }

        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File> getFiles();

        public abstract java.lang.String getOrgId();
    }

    @com.google.auto.value.AutoValue
    public static abstract class Session {

        @com.google.auto.value.AutoValue
        public static abstract class Application {

            @com.google.auto.value.AutoValue.Builder
            public static abstract class Builder {
                public Builder() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatform(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDevelopmentPlatformVersion(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setDisplayVersion(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setIdentifier(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setInstallationUuid(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder setVersion(java.lang.String r1);
            }

            @com.google.auto.value.AutoValue
            public static abstract class Organization {
                public Organization() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract java.lang.String getClsId();
            }

            public Application() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Builder builder() {
                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Application$Builder
                    r0.<init>()
                    return r0
            }

            public abstract java.lang.String getDevelopmentPlatform();

            public abstract java.lang.String getDevelopmentPlatformVersion();

            public abstract java.lang.String getDisplayVersion();

            public abstract java.lang.String getIdentifier();

            public abstract java.lang.String getInstallationUuid();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application.Organization getOrganization();

            public abstract java.lang.String getVersion();
        }

        @com.google.auto.value.AutoValue.Builder
        public static abstract class Builder {
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session build();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setAppQualitySessionId(java.lang.String r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setCrashed(boolean r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEndedAt(java.lang.Long r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGenerator(java.lang.String r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setGeneratorType(int r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifier(java.lang.String r1);

            public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setIdentifierFromUtf8Bytes(byte[] r3) {
                    r2 = this;
                    java.lang.String r0 = new java.lang.String
                    java.nio.charset.Charset r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.access$000()
                    r0.<init>(r3, r1)
                    com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r3 = r2.setIdentifier(r0)
                    return r3
            }

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setOs(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setStartedAt(long r1);

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder setUser(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User r1);
        }

        @com.google.auto.value.AutoValue
        public static abstract class Device {

            @com.google.auto.value.AutoValue.Builder
            public static abstract class Builder {
                public Builder() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setArch(int r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setCores(int r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setDiskSpace(long r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setManufacturer(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModel(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setModelClass(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setRam(long r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setSimulator(boolean r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder setState(int r1);
            }

            public Device() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device.Builder builder() {
                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Device$Builder
                    r0.<init>()
                    return r0
            }

            public abstract int getArch();

            public abstract int getCores();

            public abstract long getDiskSpace();

            public abstract java.lang.String getManufacturer();

            public abstract java.lang.String getModel();

            public abstract java.lang.String getModelClass();

            public abstract long getRam();

            public abstract int getState();

            public abstract boolean isSimulator();
        }

        @com.google.auto.value.AutoValue
        public static abstract class Event {

            @com.google.auto.value.AutoValue
            public static abstract class Application {

                @com.google.auto.value.AutoValue.Builder
                public static abstract class Builder {
                    public Builder() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setBackground(java.lang.Boolean r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setExecution(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int r1);
                }

                @com.google.auto.value.AutoValue
                public static abstract class Execution {

                    @com.google.auto.value.AutoValue
                    public static abstract class BinaryImage {

                        @com.google.auto.value.AutoValue.Builder
                        public static abstract class Builder {
                            public Builder() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setBaseAddress(long r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setName(java.lang.String r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setSize(long r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuid(java.lang.String r1);

                            public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder setUuidFromUtf8Bytes(byte[] r3) {
                                    r2 = this;
                                    java.lang.String r0 = new java.lang.String
                                    java.nio.charset.Charset r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.access$000()
                                    r0.<init>(r3, r1)
                                    com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Application$Execution$BinaryImage$Builder r3 = r2.setUuid(r0)
                                    return r3
                            }
                        }

                        public BinaryImage() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builder() {
                                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage$Builder
                                r0.<init>()
                                return r0
                        }

                        public abstract long getBaseAddress();

                        public abstract java.lang.String getName();

                        public abstract long getSize();

                        public abstract java.lang.String getUuid();

                        public byte[] getUuidUtf8Bytes() {
                                r2 = this;
                                java.lang.String r0 = r2.getUuid()
                                if (r0 == 0) goto Lf
                                java.nio.charset.Charset r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.access$000()
                                byte[] r0 = r0.getBytes(r1)
                                goto L10
                            Lf:
                                r0 = 0
                            L10:
                                return r0
                        }
                    }

                    @com.google.auto.value.AutoValue.Builder
                    public static abstract class Builder {
                        public Builder() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution build();

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setAppExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setBinaries(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setException(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setSignal(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder setThreads(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> r1);
                    }

                    @com.google.auto.value.AutoValue
                    public static abstract class Exception {

                        @com.google.auto.value.AutoValue.Builder
                        public static abstract class Builder {
                            public Builder() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setCausedBy(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setFrames(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setOverflowCount(int r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setReason(java.lang.String r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder setType(java.lang.String r1);
                        }

                        public Exception() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builder() {
                                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception$Builder
                                r0.<init>()
                                return r0
                        }

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception getCausedBy();

                        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames();

                        public abstract int getOverflowCount();

                        public abstract java.lang.String getReason();

                        public abstract java.lang.String getType();
                    }

                    @com.google.auto.value.AutoValue
                    public static abstract class Signal {

                        @com.google.auto.value.AutoValue.Builder
                        public static abstract class Builder {
                            public Builder() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setAddress(long r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setCode(java.lang.String r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder setName(java.lang.String r1);
                        }

                        public Signal() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal.Builder builder() {
                                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal$Builder
                                r0.<init>()
                                return r0
                        }

                        public abstract long getAddress();

                        public abstract java.lang.String getCode();

                        public abstract java.lang.String getName();
                    }

                    @com.google.auto.value.AutoValue
                    public static abstract class Thread {

                        @com.google.auto.value.AutoValue.Builder
                        public static abstract class Builder {
                            public Builder() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread build();

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setFrames(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setImportance(int r1);

                            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder setName(java.lang.String r1);
                        }

                        @com.google.auto.value.AutoValue
                        public static abstract class Frame {

                            @com.google.auto.value.AutoValue.Builder
                            public static abstract class Builder {
                                public Builder() {
                                        r0 = this;
                                        r0.<init>()
                                        return
                                }

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build();

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(java.lang.String r1);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int r1);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long r1);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long r1);

                                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(java.lang.String r1);
                            }

                            public Frame() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builder() {
                                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder
                                    r0.<init>()
                                    return r0
                            }

                            public abstract java.lang.String getFile();

                            public abstract int getImportance();

                            public abstract long getOffset();

                            public abstract long getPc();

                            public abstract java.lang.String getSymbol();
                        }

                        public Thread() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builder() {
                                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread$Builder
                                r0.<init>()
                                return r0
                        }

                        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> getFrames();

                        public abstract int getImportance();

                        public abstract java.lang.String getName();
                    }

                    public Execution() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Builder builder() {
                            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_Execution$Builder
                            r0.<init>()
                            return r0
                    }

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getAppExitInfo();

                    public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> getBinaries();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Exception getException();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Signal getSignal();

                    public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.Thread> getThreads();
                }

                @com.google.auto.value.AutoValue
                public static abstract class ProcessDetails {

                    @com.google.auto.value.AutoValue.Builder
                    public static abstract class Builder {
                        public Builder() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails build();

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(java.lang.String r1);
                    }

                    public ProcessDetails() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder builder() {
                            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails$Builder
                            r0.<init>()
                            return r0
                    }

                    public abstract int getImportance();

                    public abstract int getPid();

                    public abstract java.lang.String getProcessName();

                    public abstract boolean isDefaultProcess();
                }

                public Application() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder builder() {
                        com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Application$Builder
                        r0.<init>()
                        return r0
                }

                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails();

                public abstract java.lang.Boolean getBackground();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails();

                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getCustomAttributes();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution getExecution();

                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute> getInternalKeys();

                public abstract int getUiOrientation();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder toBuilder();
            }

            @com.google.auto.value.AutoValue.Builder
            public static abstract class Builder {
                public Builder() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setApp(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setDevice(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setLog(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setRollouts(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setTimestamp(long r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder setType(java.lang.String r1);
            }

            @com.google.auto.value.AutoValue
            public static abstract class Device {

                @com.google.auto.value.AutoValue.Builder
                public static abstract class Builder {
                    public Builder() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(java.lang.Double r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setOrientation(int r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long r1);
                }

                public Device() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device.Builder builder() {
                        com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device$Builder
                        r0.<init>()
                        return r0
                }

                public abstract java.lang.Double getBatteryLevel();

                public abstract int getBatteryVelocity();

                public abstract long getDiskUsed();

                public abstract int getOrientation();

                public abstract long getRamUsed();

                public abstract boolean isProximityOn();
            }

            @com.google.auto.value.AutoValue
            public static abstract class Log {

                @com.google.auto.value.AutoValue.Builder
                public static abstract class Builder {
                    public Builder() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder setContent(java.lang.String r1);
                }

                public Log() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder builder() {
                        com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Log$Builder
                        r0.<init>()
                        return r0
                }

                public abstract java.lang.String getContent();
            }

            @com.google.auto.value.AutoValue
            public static abstract class RolloutAssignment {

                @com.google.auto.value.AutoValue.Builder
                public static abstract class Builder {
                    public Builder() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(java.lang.String r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(java.lang.String r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant r1);

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long r1);
                }

                @com.google.auto.value.AutoValue
                public static abstract class RolloutVariant {

                    @com.google.auto.value.AutoValue.Builder
                    public static abstract class Builder {
                        public Builder() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build();

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(java.lang.String r1);

                        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(java.lang.String r1);
                    }

                    public RolloutVariant() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder builder() {
                            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant$Builder
                            r0.<init>()
                            return r0
                    }

                    public abstract java.lang.String getRolloutId();

                    public abstract java.lang.String getVariantId();
                }

                public RolloutAssignment() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder builder() {
                        com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment$Builder
                        r0.<init>()
                        return r0
                }

                public abstract java.lang.String getParameterKey();

                public abstract java.lang.String getParameterValue();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant();

                public abstract long getTemplateVersion();
            }

            @com.google.auto.value.AutoValue
            public static abstract class RolloutsState {

                @com.google.auto.value.AutoValue.Builder
                public static abstract class Builder {
                    public Builder() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState build();

                    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> r1);
                }

                public RolloutsState() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder builder() {
                        com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_RolloutsState$Builder
                        r0.<init>()
                        return r0
                }

                public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments();
            }

            public Event() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder builder() {
                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event$Builder
                    r0.<init>()
                    return r0
            }

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application getApp();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Device getDevice();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log getLog();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState getRollouts();

            public abstract long getTimestamp();

            public abstract java.lang.String getType();

            public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Builder toBuilder();
        }

        @com.google.auto.value.AutoValue
        public static abstract class OperatingSystem {

            @com.google.auto.value.AutoValue.Builder
            public static abstract class Builder {
                public Builder() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setBuildVersion(java.lang.String r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setJailbroken(boolean r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setPlatform(int r1);

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder setVersion(java.lang.String r1);
            }

            public OperatingSystem() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem.Builder builder() {
                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_OperatingSystem$Builder
                    r0.<init>()
                    return r0
            }

            public abstract java.lang.String getBuildVersion();

            public abstract int getPlatform();

            public abstract java.lang.String getVersion();

            public abstract boolean isJailbroken();
        }

        @com.google.auto.value.AutoValue
        public static abstract class User {

            @com.google.auto.value.AutoValue.Builder
            public static abstract class Builder {
                public Builder() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User build();

                public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder setIdentifier(java.lang.String r1);
            }

            public User() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder builder() {
                    com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_User$Builder
                    r0.<init>()
                    return r0
            }

            public abstract java.lang.String getIdentifier();
        }

        public Session() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder builder() {
                com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session$Builder
                r0.<init>()
                r1 = 0
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r0 = r0.setCrashed(r1)
                return r0
        }

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Application getApp();

        public abstract java.lang.String getAppQualitySessionId();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Device getDevice();

        public abstract java.lang.Long getEndedAt();

        public abstract java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> getEvents();

        public abstract java.lang.String getGenerator();

        public abstract int getGeneratorType();

        public abstract java.lang.String getIdentifier();

        public byte[] getIdentifierUtf8Bytes() {
                r2 = this;
                java.lang.String r0 = r2.getIdentifier()
                java.nio.charset.Charset r1 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.access$000()
                byte[] r0 = r0.getBytes(r1)
                return r0
        }

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.OperatingSystem getOs();

        public abstract long getStartedAt();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User getUser();

        public abstract boolean isCrashed();

        public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Builder toBuilder();

        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session withAppQualitySessionId(java.lang.String r2) {
                r1 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r0 = r1.toBuilder()
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r0.setAppQualitySessionId(r2)
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r2 = r2.build()
                return r2
        }

        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session withEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> r2) {
                r1 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r0 = r1.toBuilder()
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r2 = r0.setEvents(r2)
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r2 = r2.build()
                return r2
        }

        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session withSessionEndFields(long r2, boolean r4, java.lang.String r5) {
                r1 = this;
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Builder r0 = r1.toBuilder()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r0.setEndedAt(r2)
                r0.setCrashed(r4)
                if (r5 == 0) goto L1f
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User$Builder r2 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.builder()
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User$Builder r2 = r2.setIdentifier(r5)
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$User r2 = r2.build()
                r0.setUser(r2)
            L1f:
                com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r2 = r0.build()
                return r2
        }
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport.UTF_8 = r0
            return
    }

    public CrashlyticsReport() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.nio.charset.Charset access$000() {
            java.nio.charset.Charset r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.UTF_8
            return r0
    }

    public static com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder builder() {
            com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$Builder r0 = new com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport$Builder
            r0.<init>()
            return r0
    }

    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo getAppExitInfo();

    public abstract java.lang.String getAppQualitySessionId();

    public abstract java.lang.String getBuildVersion();

    public abstract java.lang.String getDisplayVersion();

    public abstract java.lang.String getFirebaseAuthenticationToken();

    public abstract java.lang.String getFirebaseInstallationId();

    public abstract java.lang.String getGmpAppId();

    public abstract java.lang.String getInstallationUuid();

    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload getNdkPayload();

    public abstract int getPlatform();

    public abstract java.lang.String getSdkVersion();

    public abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session getSession();

    protected abstract com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Builder toBuilder();

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withAppQualitySessionId(java.lang.String r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r2.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setAppQualitySessionId(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r2.getSession()
            if (r1 == 0) goto L19
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r2.getSession()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r3 = r1.withAppQualitySessionId(r3)
            r0.setSession(r3)
        L19:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3 = r0.build()
            return r3
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withApplicationExitInfo(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = r1
            goto L10
        L4:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r1.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r2 = r0.setAppExitInfo(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2 = r2.build()
        L10:
            return r2
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withEvents(java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event> r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r0 = r2.getSession()
            if (r0 == 0) goto L1b
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r2.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r2.getSession()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r3 = r1.withEvents(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r3 = r0.setSession(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3 = r3.build()
            return r3
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Reports without sessions cannot have events added to them."
            r3.<init>(r0)
            throw r3
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withFirebaseAuthenticationToken(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r1.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r2 = r0.setFirebaseAuthenticationToken(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2 = r2.build()
            return r2
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withFirebaseInstallationId(java.lang.String r2) {
            r1 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r1.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r2 = r0.setFirebaseInstallationId(r2)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r2 = r2.build()
            return r2
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withNdkPayload(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload r3) {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r2.toBuilder()
            r1 = 0
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r0.setSession(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r3 = r0.setNdkPayload(r3)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3 = r3.build()
            return r3
    }

    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport withSessionEndFields(long r3, boolean r5, java.lang.String r6) {
            r2 = this;
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Builder r0 = r2.toBuilder()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r2.getSession()
            if (r1 == 0) goto L15
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r1 = r2.getSession()
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session r3 = r1.withSessionEndFields(r3, r5, r6)
            r0.setSession(r3)
        L15:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport r3 = r0.build()
            return r3
    }
}
