package com.fit2cloud.qingcloud.wsclient.domain.model;

public class QingCloudAction {
    //images
    public static String DESCRIBE_IMAGES = "DescribeImages";
    public static String CAPTURE_INSTANCE = "CaptureInstance";
    public static String DELETE_IMAGES = "DeleteImages";
    public static String MODIFY_IMAGE_ATTRIBUTES = "ModifyImageAttributes";
    public static String GRANT_IMAGE_TO_USERS = "GrantImageToUsers";
    public static String REVOKE_IMAGE_FROM_USERS = "RevokeImageFromUsers";

    // instances
    public static String DESCRIBE_INSTANCES = "DescribeInstances";
    public static String RUN_INSTANCES = "RunInstances";
    public static String TERMINATE_INSTANCES = "TerminateInstances";
    public static String START_INSTANCES = "StartInstances";
    public static String RESTART_INSTANCES = "RestartInstances";
    public static String STOP_INSTANCES = "StopInstances";
    public static String RESIZE_INSTANCES = "ResizeInstances";
    public static String RESET_INSTANCES = "ResetInstances";
    public static String MODIFY_INSTANCE_ATTRIBUTES = "ModifyInstanceAttributes";

    // user data
    public static String UPLOAD_USERDATA_ATTACHMENT = "UploadUserDataAttachment";

    // volumes
    public static String DESCRIBE_VOLUMES = "DescribeVolumes";
    public static String CREATE_VOLUMES = "CreateVolumes";
    public static String DELETE_VOLUMES = "DeleteVolumes";
    public static String ATTACH_VOLUMES = "AttachVolumes";
    public static String DETACH_VOLUMES = "DetachVolumes";
    public static String RESIZE_VOLUMES = "ResizeVolumes";
    public static String MODIFY_VOLUME_ATTRIBUTES = "ModifyVolumeAttributes";

    // key pair
    public static String DESCRIBE_KEY_PAIRS = "DescribeKeyPairs";
    public static String CREATE_KEY_PAIR = "CreateKeyPair";
    public static String DELETE_KEY_PAIRS = "DeleteKeyPairs";
    public static String ATTACH_KEY_PAIRS = "AttachKeyPairs";
    public static String DETACH_KEY_PAIRS = "DetachKeyPairs";
    public static String MODIFY_KEYPAIR_ATTRIBUTES = "ModifyKeyPairAttributes";

    // security group
    public static String DESCRIBE_SECURITY_GROUPS = "DescribeSecurityGroups";
    public static String CREATE_SECURITY_GROUP = "CreateSecurityGroup";
    public static String MODIFY_SECURITY_GROUP_ATTRIBUTES = "ModifySecurityGroupAttributes";
    public static String APPLY_SECURITY_GROUP = "ApplySecurityGroup";
    public static String DELETE_SECURITY_GROUPS = "DeleteSecurityGroups";
    public static String DESCRIBE_SECURITY_GROUP_RULES = "DescribeSecurityGroupRules";
    public static String ADD_SECURITY_GROUP_RULES = "AddSecurityGroupRules";
    public static String DELETE_SECURITY_GROUP_RULES = "DeleteSecurityGroupRules";
    public static String MODIFY_SECURITY_GROUP_RULE_ATTRIBUTES = "ModifySecurityGroupRuleAttributes";

    // vxnets
    public static String DESCRIBE_VXNETS = "DescribeVxnets";
    public static String CREATE_VXNETS = "CreateVxnets";
    public static String DELETE_VXNETS = "DeleteVxnets";
    public static String JOIN_VXNET = "JoinVxnet";
    public static String LEAVE_VXNET = "LeaveVxnet";
    public static String MODIFY_VXNET_ATTRIBUTES = "ModifyVxnetAttributes";
    public static String DESCRIBE_VXNET_INSTANCES = "DescribeVxnetInstances";

    // router
    public static String CREATE_ROUTERS = "CreateRouters";
    public static String UPDATE_ROUTERS = "UpdateRouters";
    public static String DELETE_ROUTERS = "DeleteRouters";
    public static String JOIN_ROUTER = "JoinRouter";
    public static String LEAVE_ROUTER = "LeaveRouter";
    public static String POWEROFF_ROUTERS = "PowerOffRouters";
    public static String POWERON_ROUTERS = "PowerOnRouters";
    public static String DESCRIBE_ROUTERS = "DescribeRouters";
    public static String DESCRIBE_ROUTER_VXNETS = "DescribeRouterVxnets";
    public static String MODIFY_ROUTER_ATTRIBUTES = "ModifyRouterAttributes";
    public static String DESCRIBE_ROUTER_STATICS = "DescribeRouterStatics";
    public static String ADD_ROUTER_STATICS = "AddRouterStatics";
    public static String DELETE_ROUTER_STATICS = "DeleteRouterStatics";
    public static String MODIFY_ROUTER_STATIC_ATTRIBUTES = "ModifyRouterStaticAttributes";

    // eip
    public static String ASSOCIATE_EIP = "AssociateEip";
    public static String DISSOCIATE_EIPS = "DissociateEips";
    public static String ALLOCATE_EIPS = "AllocateEips";
    public static String RELEASE_EIPS = "ReleaseEips";
    public static String DESCRIBE_EIPS = "DescribeEips";
    public static String MODIFY_EIP_ATTRIBUTES = "ModifyEipAttributes";
    public static String CHANGE_EIPS_BANDWIDTH = "ChangeEipsBandwidth";

    // lb
    public static String DESCRIBE_LOADBALANCERS = "DescribeLoadBalancers";
    public static String CREATE_LOADBALANCER = "CreateLoadBalancer";
    public static String DELETE_LOADBALANCERS = "DeleteLoadBalancers";
    public static String ASSOCIATE_EIPS_TO_LOADBALANCER = "AssociateEipsToLoadBalancer";
    public static String DISSOCIATE_EIPS_FROM_LOADBALANCER = "DissociateEipsFromLoadBalancer";
    public static String UPDATE_LOADBALANCERS = "UpdateLoadBalancers";
    public static String STOP_LOADBALANCERS = "StopLoadBalancers";
    public static String START_LOADBALANCERS = "StartLoadBalancers";
    public static String MODIFY_LOADBALANCER_ATTRIBUTES = "ModifyLoadBalancerAttributes";
    public static String RESIZE_LOADBALANCERS = "ResizeLoadBalancers";

    public static String DESCRIBE_LOADBALANCER_LISTENERS = "DescribeLoadBalancerListeners";
    public static String ADD_LOADBALANCER_LISTENERS = "AddLoadBalancerListeners";
    public static String DELETE_LOADBALANCER_LISTENERS = "DeleteLoadBalancerListeners";
    public static String MODIFY_LOADBALANCER_LISTENER_ATTRIBUTES = "ModifyLoadBalancerListenerAttributes";
    public static String ADD_LOADBALANCER_BACKENDS = "AddLoadBalancerBackends";
    public static String DELETE_LOADBALANCER_BACKENDS = "DeleteLoadBalancerBackends";
    public static String MODIFY_LOADBALANCER_BACKEND_ATTRIBUTES = "ModifyLoadBalancerBackendAttributes";
    public static String DESCRIBE_LOADBALANCER_BACKENDS = "DescribeLoadBalancerBackends";

    // monitor
    public static String GET_MONITOR = "GetMonitor";
    public static String GET_LOADBALANCER_MONITOR = "GetLoadBalancerMonitor";

    // snapshot
    public static String CREATE_SNAPSHOTS = "CreateSnapshots";
    public static String DELETE_SNAPSHOTS = "DeleteSnapshots";
    public static String APPLY_SNAPSHOTS = "ApplySnapshots";
    public static String DESCRIBE_SNAPSHOTS = "DescribeSnapshots";
    public static String MODIFY_SNAPSHOT_ATTRIBUTES = "ModifySnapshotAttributes";
    public static String CAPTURE_INSTANCE_FROM_SNAPSHOT = "CaptureInstanceFromSnapshot";
    public static String CREATE_VOLUME_FROM_SNAPSHOT = "CreateVolumeFromSnapshot";

    // job
    public static String DESCRIBE_JOBS = "DescribeJobs";

    // zone
    public static String DESCRIBE_ZONES = "DescribeZones";

    // app
    public static final String DESCRIBE_USERS = "DescribeUsers";
    public static final String LEASE_APP = "LeaseApp";
    public static final String UNLEASE_APP = "UnLeaseApp";


    // tag
    public static final String DESCRIBE_TAGS = "DescribeTags";
    public static final String CREATE_TAG = "CreateTag";
    public static final String DELETE_TAGS = "DeleteTags";
    public static final String MODIFY_TAG_ATTRIBUTES = "ModifyTagAttributes";
    public static final String ATTACH_TAGS = "AttachTags";
    public static final String DETACH_TAGS = "DetachTags";


    // rdb
    public static final String CREATE_RDB = "CreateRDB";
    public static final String DESCRIBE_RDBS = "DescribeRDBs";
    public static final String DELETE_RDBS = "DeleteRDBs";
    public static final String START_RDBS = "StartRDBs";
    public static final String STOP_RDBS = "StopRDBs";
    public static final String RESIZE_RDBS = "ResizeRDBs";
    public static final String RDBS_LEAVE_VXNET = "RDBsLeaveVxnet";
    public static final String RDBS_JOIN_VXNET = "RDBsJoinVxnet";
    public static final String CREATRE_RDB_FROM_SNAPSHOT = "CreateRDBFromSnapshot";
    public static final String CREATE_RDB_INSTANCE_FROM_SNAPSHOT = "CreateRDBInstanceFromSnapshot";
    public static final String GET_RDB_INSTANCE_FILES = "GetRDBInstanceFiles";
    public static final String COPY_RDB_INSTANCE_FILES_TO_FTP = "CopyRDBInstanceFilesToFTP";
    public static final String GET_RDB_MONITOR = "GetRDBMonitor";
    public static final String MODIFY_RDB_PARAMETERS = "ModifyRDBParameters";
    public static final String APPLY_RDB_PARAMETERGROUP = "ApplyRDBParameterGroup";
    public static final String DESCRIBE_RDB_PARAMETERS = "DescribeRDBParameters";

}
