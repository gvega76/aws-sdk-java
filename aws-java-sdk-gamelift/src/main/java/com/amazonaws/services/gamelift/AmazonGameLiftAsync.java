/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.gamelift;

import com.amazonaws.services.gamelift.model.*;

/**
 * Interface for accessing Amazon GameLift asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Welcome to the <i>Amazon GameLift API Reference</i>. Amazon GameLift is a
 * managed Amazon Web Services (AWS) service for developers who need a scalable,
 * server-based solution for multiplayer games. Amazon GameLift provides setup
 * and deployment of game servers, and handles infrastructure scaling and
 * session management.
 * </p>
 * <p>
 * This reference describes the low-level service API for GameLift. You can call
 * this API directly or use the <a href="https://aws.amazon.com/tools/">AWS
 * SDK</a> for your preferred language. The AWS SDK includes a set of high-level
 * GameLift actions multiplayer game sessions. Alternatively, you can use the <a
 * href="https://aws.amazon.com/cli/">AWS command-line interface</a> (CLI) tool,
 * which includes commands for GameLift. For administrative actions, you can
 * also use the Amazon GameLift console.
 * </p>
 * <p>
 * <b>More Resources</b>
 * </p>
 * <ul>
 * <li><a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon
 * GameLift Developer Guide</a>: Learn more about GameLift features and how to
 * use them</li>
 * <li><a href="https://gamedev.amazon.com/forums/tutorials">Lumberyard and
 * GameLift Tutorials</a>: Get started fast with walkthroughs and sample
 * projects</li>
 * <li><a href="https://aws.amazon.com/blogs/gamedev/">GameDev Blog</a>: Stay up
 * to date with new features and techniques</li>
 * <li><a href=
 * "https://gamedev.amazon.com/forums/spaces/123/gamelift-discussion.html"
 * >GameDev Forums</a>: Connect with the GameDev community</li>
 * </ul>
 * <p>
 * <b>Manage Games and Players Through GameLift</b>
 * </p>
 * <p>
 * Call these actions from your game clients and/or services to create and
 * manage multiplayer game sessions and player sessions.
 * </p>
 * <ul>
 * <li><b>Game sessions</b>
 * <ul>
 * <li><a>CreateGameSession</a></li>
 * <li><a>DescribeGameSessions</a></li>
 * <li><a>DescribeGameSessionDetails</a></li>
 * <li><a>UpdateGameSession</a></li>
 * </ul>
 * </li>
 * <li><b>Player sessions</b>
 * <ul>
 * <li><a>CreatePlayerSession</a></li>
 * <li><a>CreatePlayerSessions</a></li>
 * <li><a>DescribePlayerSessions</a></li>
 * </ul>
 * </li>
 * <li><b>Other actions:</b>
 * <ul>
 * <li><a>GetGameSessionLogUrl</a></li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Set Up and Manage Game Servers</b>
 * </p>
 * <p>
 * Use these administrative actions to configure GameLift to host your game
 * servers. When setting up GameLift, you'll need to (1) configure a build for
 * your game and upload build files, and (2) set up one or more fleets to host
 * game sessions. Once you've created and activated a fleet, you can assign
 * aliases to it, scale capacity, track performance and utilization, etc.
 * </p>
 * <ul>
 * <li><b>Manage your builds:</b>
 * <ul>
 * <li><a>ListBuilds</a></li>
 * <li><a>CreateBuild</a></li>
 * <li><a>DescribeBuild</a></li>
 * <li><a>UpdateBuild</a></li>
 * <li><a>DeleteBuild</a></li>
 * <li><a>RequestUploadCredentials</a></li>
 * </ul>
 * </li>
 * <li><b>Manage your fleets:</b>
 * <ul>
 * <li><a>ListFleets</a></li>
 * <li><a>CreateFleet</a></li>
 * <li>Describe fleets:
 * <ul>
 * <li><a>DescribeFleetAttributes</a></li>
 * <li><a>DescribeFleetCapacity</a></li>
 * <li><a>DescribeFleetPortSettings</a></li>
 * <li><a>DescribeFleetUtilization</a></li>
 * <li><a>DescribeEC2InstanceLimits</a></li>
 * <li><a>DescribeFleetEvents</a></li>
 * <li><a>DescribeRuntimeConfiguration</a></li>
 * </ul>
 * </li>
 * <li>Update fleets:
 * <ul>
 * <li><a>UpdateFleetAttributes</a></li>
 * <li><a>UpdateFleetCapacity</a></li>
 * <li><a>UpdateFleetPortSettings</a></li>
 * <li><a>UpdateRuntimeConfiguration</a></li>
 * </ul>
 * </li>
 * <li><a>DeleteFleet</a></li>
 * </ul>
 * </li>
 * <li><b>Manage fleet aliases:</b>
 * <ul>
 * <li><a>ListAliases</a></li>
 * <li><a>CreateAlias</a></li>
 * <li><a>DescribeAlias</a></li>
 * <li><a>UpdateAlias</a></li>
 * <li><a>DeleteAlias</a></li>
 * <li><a>ResolveAlias</a></li>
 * </ul>
 * </li>
 * <li><b>Manage autoscaling:</b>
 * <ul>
 * <li><a>PutScalingPolicy</a></li>
 * <li><a>DescribeScalingPolicies</a></li>
 * <li><a>DeleteScalingPolicy</a></li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * To view changes to the API, see the GameLift <a href=
 * "http://docs.aws.amazon.com/gamelift/latest/developerguide/doc-history.html"
 * >Document History</a> page.
 * </p>
 */
public interface AmazonGameLiftAsync extends AmazonGameLift {

    /**
     * <p>
     * Creates an alias for a fleet. You can use an alias to anonymize your
     * fleet by referencing an alias instead of a specific fleet when you create
     * game sessions. Amazon GameLift supports two types of routing strategies
     * for aliases: simple and terminal. Use a simple alias to point to an
     * active fleet. Use a terminal alias to display a message to incoming
     * traffic instead of routing players to an active fleet. This option is
     * useful when a game server is no longer supported but you want to provide
     * better messaging than a standard 404 error.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and
     * optional description. If successful, a new alias record is returned,
     * including an alias ID, which you can reference when creating a game
     * session. To reassign the alias to another fleet ID, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.CreateAlias
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an alias for a fleet. You can use an alias to anonymize your
     * fleet by referencing an alias instead of a specific fleet when you create
     * game sessions. Amazon GameLift supports two types of routing strategies
     * for aliases: simple and terminal. Use a simple alias to point to an
     * active fleet. Use a terminal alias to display a message to incoming
     * traffic instead of routing players to an active fleet. This option is
     * useful when a game server is no longer supported but you want to provide
     * better messaging than a standard 404 error.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and
     * optional description. If successful, a new alias record is returned,
     * including an alias ID, which you can reference when creating a game
     * session. To reassign the alias to another fleet ID, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateAlias
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Initializes a new build record and generates information required to
     * upload a game build to Amazon GameLift. Once the build record has been
     * created and is in an <code>INITIALIZED</code> state, you can upload your
     * game build.
     * </p>
     * <important>
     * <p>
     * Do not use this API action unless you are using your own Amazon Simple
     * Storage Service (Amazon S3) client and need to manually upload your build
     * files. Instead, to create a build, use the CLI command
     * <code>upload-build</code>, which creates a new build record and uploads
     * the build files in one step. (See the <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon
     * GameLift Developer Guide</a> for more details on the CLI and the upload
     * process.)
     * </p>
     * </important>
     * <p>
     * To create a new build, optionally specify a build name and version. This
     * metadata is stored with other properties in the build record and is
     * displayed in the GameLift console (it is not visible to players). If
     * successful, this action returns the newly created build record along with
     * the Amazon S3 storage location and AWS account credentials. Use the
     * location and credentials to upload your game build.
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.CreateBuild
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(
            CreateBuildRequest createBuildRequest);

    /**
     * <p>
     * Initializes a new build record and generates information required to
     * upload a game build to Amazon GameLift. Once the build record has been
     * created and is in an <code>INITIALIZED</code> state, you can upload your
     * game build.
     * </p>
     * <important>
     * <p>
     * Do not use this API action unless you are using your own Amazon Simple
     * Storage Service (Amazon S3) client and need to manually upload your build
     * files. Instead, to create a build, use the CLI command
     * <code>upload-build</code>, which creates a new build record and uploads
     * the build files in one step. (See the <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon
     * GameLift Developer Guide</a> for more details on the CLI and the upload
     * process.)
     * </p>
     * </important>
     * <p>
     * To create a new build, optionally specify a build name and version. This
     * metadata is stored with other properties in the build record and is
     * displayed in the GameLift console (it is not visible to players). If
     * successful, this action returns the newly created build record along with
     * the Amazon S3 storage location and AWS account credentials. Use the
     * location and credentials to upload your game build.
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateBuild
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(
            CreateBuildRequest createBuildRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBuildRequest, CreateBuildResult> asyncHandler);

    /**
     * <p>
     * Creates a new fleet to run your game servers. A fleet is a set of Amazon
     * Elastic Compute Cloud (Amazon EC2) instances, each of which can run
     * multiple server processes to host game sessions. You configure a fleet to
     * create instances with certain hardware specifications (see <a
     * href="https://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for more information), and deploy a specified game build to
     * each instance. A newly created fleet passes through several states; once
     * it reaches the <code>ACTIVE</code> state, it can begin hosting game
     * sessions.
     * </p>
     * <p>
     * To create a new fleet, provide a fleet name, an EC2 instance type, and a
     * build ID of the game build to deploy. You can also configure the new
     * fleet with the following settings: (1) a runtime configuration describing
     * what server processes to run on each instance in the fleet (required to
     * create fleet), (2) access permissions for inbound traffic, (3) fleet-wide
     * game session protection, and (4) the location of default log files for
     * GameLift to upload and store.
     * </p>
     * <p>
     * If the <code>CreateFleet</code> call is successful, Amazon GameLift
     * performs the following tasks:
     * </p>
     * <ul>
     * <li>Creates a fleet record and sets the state to <code>NEW</code>
     * (followed by other states as the fleet is activated).</li>
     * <li>Sets the fleet's capacity to 1 "desired", which causes GameLift to
     * start one new EC2 instance.</li>
     * <li>Starts launching server processes on the instance. If the fleet is
     * configured to run multiple server processes per instance, GameLift
     * staggers each launch by a few seconds.</li>
     * <li>Begins writing events to the fleet event log, which can be accessed
     * in the GameLift console.</li>
     * <li>Sets the fleet's status to <code>ACTIVE</code> once one server
     * process in the fleet is ready to host a game session.</li>
     * </ul>
     * <p>
     * After a fleet is created, use the following actions to change fleet
     * properties and configuration:
     * </p>
     * <ul>
     * <li><a>UpdateFleetAttributes</a> -- Update fleet metadata, including name
     * and description.</li>
     * <li><a>UpdateFleetCapacity</a> -- Increase or decrease the number of
     * instances you want the fleet to maintain.</li>
     * <li><a>UpdateFleetPortSettings</a> -- Change the IP address and port
     * ranges that allow access to incoming traffic.</li>
     * <li><a>UpdateRuntimeConfiguration</a> -- Change how server processes are
     * launched in the fleet, including launch path, launch parameters, and the
     * number of concurrent processes.</li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateFleet operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.CreateFleet
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(
            CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a new fleet to run your game servers. A fleet is a set of Amazon
     * Elastic Compute Cloud (Amazon EC2) instances, each of which can run
     * multiple server processes to host game sessions. You configure a fleet to
     * create instances with certain hardware specifications (see <a
     * href="https://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for more information), and deploy a specified game build to
     * each instance. A newly created fleet passes through several states; once
     * it reaches the <code>ACTIVE</code> state, it can begin hosting game
     * sessions.
     * </p>
     * <p>
     * To create a new fleet, provide a fleet name, an EC2 instance type, and a
     * build ID of the game build to deploy. You can also configure the new
     * fleet with the following settings: (1) a runtime configuration describing
     * what server processes to run on each instance in the fleet (required to
     * create fleet), (2) access permissions for inbound traffic, (3) fleet-wide
     * game session protection, and (4) the location of default log files for
     * GameLift to upload and store.
     * </p>
     * <p>
     * If the <code>CreateFleet</code> call is successful, Amazon GameLift
     * performs the following tasks:
     * </p>
     * <ul>
     * <li>Creates a fleet record and sets the state to <code>NEW</code>
     * (followed by other states as the fleet is activated).</li>
     * <li>Sets the fleet's capacity to 1 "desired", which causes GameLift to
     * start one new EC2 instance.</li>
     * <li>Starts launching server processes on the instance. If the fleet is
     * configured to run multiple server processes per instance, GameLift
     * staggers each launch by a few seconds.</li>
     * <li>Begins writing events to the fleet event log, which can be accessed
     * in the GameLift console.</li>
     * <li>Sets the fleet's status to <code>ACTIVE</code> once one server
     * process in the fleet is ready to host a game session.</li>
     * </ul>
     * <p>
     * After a fleet is created, use the following actions to change fleet
     * properties and configuration:
     * </p>
     * <ul>
     * <li><a>UpdateFleetAttributes</a> -- Update fleet metadata, including name
     * and description.</li>
     * <li><a>UpdateFleetCapacity</a> -- Increase or decrease the number of
     * instances you want the fleet to maintain.</li>
     * <li><a>UpdateFleetPortSettings</a> -- Change the IP address and port
     * ranges that allow access to incoming traffic.</li>
     * <li><a>UpdateRuntimeConfiguration</a> -- Change how server processes are
     * launched in the fleet, including launch path, launch parameters, and the
     * number of concurrent processes.</li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateFleet
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(
            CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a
     * game session record and assigns the new session to an instance in the
     * specified fleet, which initializes a new server process to host the game
     * session. A fleet must be in an <code>ACTIVE</code> state before a game
     * session can be created in it.
     * </p>
     * <p>
     * To create a game session, specify either a fleet ID or an alias ID and
     * indicate the maximum number of players the game session allows. You can
     * also provide a name and a set of properties for your game (optional). If
     * successful, a <a>GameSession</a> object is returned containing session
     * properties, including an IP address. By default, newly created game
     * sessions are set to accept adding any new players to the game session.
     * Use <a>UpdateGameSession</a> to change the creation policy.
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateGameSession
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(
            CreateGameSessionRequest createGameSessionRequest);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a
     * game session record and assigns the new session to an instance in the
     * specified fleet, which initializes a new server process to host the game
     * session. A fleet must be in an <code>ACTIVE</code> state before a game
     * session can be created in it.
     * </p>
     * <p>
     * To create a game session, specify either a fleet ID or an alias ID and
     * indicate the maximum number of players the game session allows. You can
     * also provide a name and a set of properties for your game (optional). If
     * successful, a <a>GameSession</a> object is returned containing session
     * properties, including an IP address. By default, newly created game
     * sessions are set to accept adding any new players to the game session.
     * Use <a>UpdateGameSession</a> to change the creation policy.
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateGameSession
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(
            CreateGameSessionRequest createGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameSessionRequest, CreateGameSessionResult> asyncHandler);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. A
     * game session must be in an <code>ACTIVE</code> state, have a creation
     * policy of <code>ALLOW_ALL</code>, and have an open player slot before
     * players can be added to the session.
     * </p>
     * <p>
     * To create a player session, specify a game session ID and player ID. If
     * successful, the player is added to the game session and a new
     * <a>PlayerSession</a> object is returned.
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreatePlayerSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSession
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(
            CreatePlayerSessionRequest createPlayerSessionRequest);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. A
     * game session must be in an <code>ACTIVE</code> state, have a creation
     * policy of <code>ALLOW_ALL</code>, and have an open player slot before
     * players can be added to the session.
     * </p>
     * <p>
     * To create a player session, specify a game session ID and player ID. If
     * successful, the player is added to the game session and a new
     * <a>PlayerSession</a> object is returned.
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSession
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(
            CreatePlayerSessionRequest createPlayerSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionRequest, CreatePlayerSessionResult> asyncHandler);

    /**
     * <p>
     * Adds a group of players to a game session. Similar to
     * <a>CreatePlayerSession</a>, this action allows you to add multiple
     * players in a single call, which is useful for games that provide party
     * and/or matchmaking features. A game session must be in an
     * <code>ACTIVE</code> state, have a creation policy of
     * <code>ALLOW_ALL</code>, and have an open player slot before players can
     * be added to the session.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player
     * IDs. If successful, the players are added to the game session and a set
     * of new <a>PlayerSession</a> objects is returned.
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreatePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSessions
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(
            CreatePlayerSessionsRequest createPlayerSessionsRequest);

    /**
     * <p>
     * Adds a group of players to a game session. Similar to
     * <a>CreatePlayerSession</a>, this action allows you to add multiple
     * players in a single call, which is useful for games that provide party
     * and/or matchmaking features. A game session must be in an
     * <code>ACTIVE</code> state, have a creation policy of
     * <code>ALLOW_ALL</code>, and have an open player slot before players can
     * be added to the session.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player
     * IDs. If successful, the players are added to the game session and a set
     * of new <a>PlayerSession</a> objects is returned.
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSessions
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(
            CreatePlayerSessionsRequest createPlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionsRequest, CreatePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias; game
     * clients attempting to access a server process using the deleted alias
     * receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.DeleteAlias
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(
            DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias; game
     * clients attempting to access a server process using the deleted alias
     * receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteAlias
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(
            DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any
     * uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the
     * status of any active fleets using the build, but you can no longer create
     * new fleets with the deleted build.
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.DeleteBuild
     */
    java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(
            DeleteBuildRequest deleteBuildRequest);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any
     * uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the
     * status of any active fleets using the build, but you can no longer create
     * new fleets with the deleted build.
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteBuild
     */
    java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(
            DeleteBuildRequest deleteBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBuildRequest, DeleteBuildResult> asyncHandler);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must
     * set the fleet's desired capacity to zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a
     * fleet is deleted, you can no longer use that fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteFleet operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.DeleteFleet
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(
            DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must
     * set the fleet's desired capacity to zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a
     * fleet is deleted, you can no longer use that fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteFleet
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(
            DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no
     * longer in force and removes all record of it. To delete a scaling policy,
     * specify both the scaling policy name and the fleet ID it is associated
     * with.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DeleteScalingPolicy
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteScalingPolicy
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(
            DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no
     * longer in force and removes all record of it. To delete a scaling policy,
     * specify both the scaling policy name and the fleet ID it is associated
     * with.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScalingPolicy
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteScalingPolicy
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(
            DeleteScalingPolicyRequest deleteScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a specified alias. To get the alias, specify an
     * alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeAlias
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeAlias
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(
            DescribeAliasRequest describeAliasRequest);

    /**
     * <p>
     * Retrieves properties for a specified alias. To get the alias, specify an
     * alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlias
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeAlias
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(
            DescribeAliasRequest describeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAliasRequest, DescribeAliasResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build
     * ID. If successful, an object containing the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeBuild
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeBuild
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(
            DescribeBuildRequest describeBuildRequest);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build
     * ID. If successful, an object containing the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBuild
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeBuild
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(
            DescribeBuildRequest describeBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBuildRequest, DescribeBuildResult> asyncHandler);

    /**
     * <p>
     * Retrieves the following information for the specified EC2 instance type:
     * </p>
     * <ul>
     * <li>maximum number of instances allowed per AWS account (service limit)</li>
     * <li>current usage level for the AWS account</li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for GameLift
     * can be found in the AWS Management Console for GameLift (see the
     * drop-down list in the upper right corner).
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeEC2InstanceLimits
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

    /**
     * <p>
     * Retrieves the following information for the specified EC2 instance type:
     * </p>
     * <ul>
     * <li>maximum number of instances allowed per AWS account (service limit)</li>
     * <li>current usage level for the AWS account</li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for GameLift
     * can be found in the AWS Management Console for GameLift (see the
     * drop-down list in the upper right corner).
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeEC2InstanceLimits
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEC2InstanceLimitsRequest, DescribeEC2InstanceLimitsResult> asyncHandler);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and
     * configuration, for one or more fleets. You can request attributes for all
     * fleets, or specify a list of one or more fleet IDs. When requesting
     * multiple fleets, use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>FleetAttributes</a> object
     * is returned for each requested fleet ID. When specifying a list of fleet
     * IDs, attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetAttributes
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(
            DescribeFleetAttributesRequest describeFleetAttributesRequest);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and
     * configuration, for one or more fleets. You can request attributes for all
     * fleets, or specify a list of one or more fleet IDs. When requesting
     * multiple fleets, use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>FleetAttributes</a> object
     * is returned for each requested fleet ID. When specifying a list of fleet
     * IDs, attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetAttributes
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(
            DescribeFleetAttributesRequest describeFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetAttributesRequest, DescribeFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets.
     * This information includes the number of instances that have been
     * requested for the fleet and the number currently active. You can request
     * capacity for all fleets, or specify a list of one or more fleet IDs. When
     * requesting multiple fleets, use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a
     * <a>FleetCapacity</a> object is returned for each requested fleet ID. When
     * specifying a list of fleet IDs, attribute objects are returned only for
     * fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetCapacity
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(
            DescribeFleetCapacityRequest describeFleetCapacityRequest);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets.
     * This information includes the number of instances that have been
     * requested for the fleet and the number currently active. You can request
     * capacity for all fleets, or specify a list of one or more fleet IDs. When
     * requesting multiple fleets, use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a
     * <a>FleetCapacity</a> object is returned for each requested fleet ID. When
     * specifying a list of fleet IDs, attribute objects are returned only for
     * fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetCapacity
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(
            DescribeFleetCapacityRequest describeFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetCapacityRequest, DescribeFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Retrieves entries from the specified fleet's event log. You can specify a
     * time range to limit the result set. Use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * collection of event log entries matching the request are returned.
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetEvents
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetEvents
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(
            DescribeFleetEventsRequest describeFleetEventsRequest);

    /**
     * <p>
     * Retrieves entries from the specified fleet's event log. You can specify a
     * time range to limit the result set. Use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * collection of event log entries matching the request are returned.
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetEvents
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetEvents
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(
            DescribeFleetEventsRequest describeFleetEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetEventsRequest, DescribeFleetEventsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the inbound connection permissions for a fleet. Connection
     * permissions include a range of IP addresses and port settings that
     * incoming traffic can use to access server processes in the fleet. To get
     * a fleet's inbound connection permissions, specify a fleet ID. If
     * successful, a collection of <a>IpPermission</a> objects is returned for
     * the requested fleet ID. If the requested fleet has been deleted, the
     * result set is empty.
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetPortSettings
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

    /**
     * <p>
     * Retrieves the inbound connection permissions for a fleet. Connection
     * permissions include a range of IP addresses and port settings that
     * incoming traffic can use to access server processes in the fleet. To get
     * a fleet's inbound connection permissions, specify a fleet ID. If
     * successful, a collection of <a>IpPermission</a> objects is returned for
     * the requested fleet ID. If the requested fleet has been deleted, the
     * result set is empty.
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetPortSettings
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetPortSettingsRequest, DescribeFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request
     * utilization data for all fleets, or specify a list of one or more fleet
     * IDs. When requesting multiple fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>FleetUtilization</a> object is returned for each requested fleet ID.
     * When specifying a list of fleet IDs, utilization objects are returned
     * only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetUtilization
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(
            DescribeFleetUtilizationRequest describeFleetUtilizationRequest);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request
     * utilization data for all fleets, or specify a list of one or more fleet
     * IDs. When requesting multiple fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>FleetUtilization</a> object is returned for each requested fleet ID.
     * When specifying a list of fleet IDs, utilization objects are returned
     * only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one
     * request. If a request exceeds this limit, the request fails and the error
     * message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetUtilization
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(
            DescribeFleetUtilizationRequest describeFleetUtilizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetUtilizationRequest, DescribeFleetUtilizationResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one
     * or more game sessions. This action can be used in several ways: (1)
     * provide a <code>GameSessionId</code> to request details for a specific
     * game session; (2) provide either a <code>FleetId</code> or an
     * <code>AliasId</code> to request properties for all game sessions running
     * on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSessionDetail</a> object
     * is returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeGameSessionDetails operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessionDetails
     */
    java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest);

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one
     * or more game sessions. This action can be used in several ways: (1)
     * provide a <code>GameSessionId</code> to request details for a specific
     * game session; (2) provide either a <code>FleetId</code> or an
     * <code>AliasId</code> to request properties for all game sessions running
     * on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSessionDetail</a> object
     * is returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeGameSessionDetails operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessionDetails
     */
    java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionDetailsRequest, DescribeGameSessionDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for one or more game sessions. This action can be
     * used in several ways: (1) provide a <code>GameSessionId</code> to request
     * properties for a specific game session; (2) provide a
     * <code>FleetId</code> or an <code>AliasId</code> to request properties for
     * all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSession</a> object is
     * returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeGameSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessions
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(
            DescribeGameSessionsRequest describeGameSessionsRequest);

    /**
     * <p>
     * Retrieves properties for one or more game sessions. This action can be
     * used in several ways: (1) provide a <code>GameSessionId</code> to request
     * properties for a specific game session; (2) provide a
     * <code>FleetId</code> or an <code>AliasId</code> to request properties for
     * all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game
     * session ID, fleet ID, or alias ID. You can filter this request by game
     * session status. Use the pagination parameters to retrieve results as a
     * set of sequential pages. If successful, a <a>GameSession</a> object is
     * returned for each session matching the request.
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessions
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(
            DescribeGameSessionsRequest describeGameSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionsRequest, DescribeGameSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be
     * used in several ways: (1) provide a <code>PlayerSessionId</code>
     * parameter to request properties for a specific player session; (2)
     * provide a <code>GameSessionId</code> parameter to request properties for
     * all player sessions in the specified game session; (3) provide a
     * <code>PlayerId</code> parameter to request properties for all player
     * sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a
     * player session ID, a game session ID, or a player ID. You can filter this
     * request by player session status. Use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>PlayerSession</a> object is returned for each session matching the
     * request.
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribePlayerSessions
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(
            DescribePlayerSessionsRequest describePlayerSessionsRequest);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be
     * used in several ways: (1) provide a <code>PlayerSessionId</code>
     * parameter to request properties for a specific player session; (2)
     * provide a <code>GameSessionId</code> parameter to request properties for
     * all player sessions in the specified game session; (3) provide a
     * <code>PlayerId</code> parameter to request properties for all player
     * sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a
     * player session ID, a game session ID, or a player ID. You can filter this
     * request by player session status. Use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a
     * <a>PlayerSession</a> object is returned for each session matching the
     * request.
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribePlayerSessions
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(
            DescribePlayerSessionsRequest describePlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePlayerSessionsRequest, DescribePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current runtime configuration for the specified fleet. The
     * runtime configuration tells GameLift how to launch server processes on
     * instances in the fleet.
     * </p>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeRuntimeConfiguration
     */
    java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(
            DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest);

    /**
     * <p>
     * Retrieves the current runtime configuration for the specified fleet. The
     * runtime configuration tells GameLift how to launch server processes on
     * instances in the fleet.
     * </p>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeRuntimeConfiguration
     */
    java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(
            DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuntimeConfigurationRequest, DescribeRuntimeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter
     * this request by policy status, such as to retrieve only active scaling
     * policies. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, set of <a>ScalingPolicy</a> objects is
     * returned for the fleet.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeScalingPolicies operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeScalingPolicies
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(
            DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter
     * this request by policy status, such as to retrieve only active scaling
     * policies. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, set of <a>ScalingPolicy</a> objects is
     * returned for the fleet.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeScalingPolicies operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeScalingPolicies
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(
            DescribeScalingPoliciesRequest describeScalingPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game
     * session. When a game session is terminated, Amazon GameLift automatically
     * stores the logs in Amazon S3. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >AWS Service Limits</a> page for maximum log file sizes. Log files that
     * exceed this limit are not saved.
     * </p>
     * </note>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the GetGameSessionLogUrl
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.GetGameSessionLogUrl
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(
            GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game
     * session. When a game session is terminated, Amazon GameLift automatically
     * stores the logs in Amazon S3. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >AWS Service Limits</a> page for maximum log file sizes. Log files that
     * exceed this limit are not saved.
     * </p>
     * </note>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGameSessionLogUrl
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetGameSessionLogUrl
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(
            GetGameSessionLogUrlRequest getGameSessionLogUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetGameSessionLogUrlRequest, GetGameSessionLogUrlResult> asyncHandler);

    /**
     * <p>
     * Retrieves a collection of alias records for this AWS account. You can
     * filter the result set by alias name and/or routing strategy type. Use the
     * pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Aliases are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListAliases operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Retrieves a collection of alias records for this AWS account. You can
     * filter the result set by alias name and/or routing strategy type. Use the
     * pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Aliases are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Retrieves build records for all builds associated with the AWS account in
     * use. You can limit results to builds in a specific state using the
     * <code>Status</code> parameter. Use the pagination parameters to retrieve
     * results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListBuilds operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ListBuilds
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(
            ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Retrieves build records for all builds associated with the AWS account in
     * use. You can limit results to builds in a specific state using the
     * <code>Status</code> parameter. Use the pagination parameters to retrieve
     * results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuilds operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListBuilds
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(
            ListBuildsRequest listBuildsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can
     * filter the result set by build ID. Use the pagination parameters to
     * retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListFleets operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ListFleets
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(
            ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can
     * filter the result set by build ID. Use the pagination parameters to
     * retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListFleets
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(
            ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. An active scaling policy
     * prompts Amazon GameLift to track a certain metric for a fleet and
     * automatically change the fleet's capacity in specific circumstances. Each
     * scaling policy contains one rule statement. Fleets can have multiple
     * scaling policies in force simultaneously.
     * </p>
     * <p>
     * A scaling policy rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code>
     * <code>[Threshold]</code> for <code>[EvaluationPeriods]</code> minutes,
     * then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * For example, this policy:
     * "If the number of idle instances exceeds 20 for more than 15 minutes, then reduce the fleet capacity by 10 instances"
     * could be implemented as the following rule statement:
     * </p>
     * <p>
     * If [IdleInstances] is [GreaterThanOrEqualToThreshold] [20] for [15]
     * minutes, then [ChangeInCapacity] by [-10].
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of
     * name and fleet ID, and set the rule values. All parameters for this
     * action are required. If successful, the policy name is returned. Scaling
     * policies cannot be suspended or made inactive. To stop enforcing a
     * scaling policy, call <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the PutScalingPolicy
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(
            PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. An active scaling policy
     * prompts Amazon GameLift to track a certain metric for a fleet and
     * automatically change the fleet's capacity in specific circumstances. Each
     * scaling policy contains one rule statement. Fleets can have multiple
     * scaling policies in force simultaneously.
     * </p>
     * <p>
     * A scaling policy rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code>
     * <code>[Threshold]</code> for <code>[EvaluationPeriods]</code> minutes,
     * then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * For example, this policy:
     * "If the number of idle instances exceeds 20 for more than 15 minutes, then reduce the fleet capacity by 10 instances"
     * could be implemented as the following rule statement:
     * </p>
     * <p>
     * If [IdleInstances] is [GreaterThanOrEqualToThreshold] [20] for [15]
     * minutes, then [ChangeInCapacity] by [-10].
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of
     * name and fleet ID, and set the rule values. All parameters for this
     * action are required. If successful, the policy name is returned. Scaling
     * policies cannot be suspended or made inactive. To stop enforcing a
     * scaling policy, call <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.PutScalingPolicy
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(
            PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves a fresh set of upload credentials and the assigned Amazon S3
     * storage location for a specific build. Valid credentials are required to
     * upload your game build files to Amazon S3.
     * </p>
     * <important>
     * <p>
     * Call this action only if you need credentials for a build created with
     * <code><a>CreateBuild</a></code>. This is a rare situation; in most cases,
     * builds are created using the CLI command <code>upload-build</code>, which
     * creates a build record and also uploads build files.
     * </p>
     * </important>
     * <p>
     * Upload credentials are returned when you create the build, but they have
     * a limited lifespan. You can get fresh credentials and use them to
     * re-upload game files until the state of that build changes to
     * <code>READY</code>. Once this happens, you must create a brand new build.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsync.RequestUploadCredentials
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(
            RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <p>
     * Retrieves a fresh set of upload credentials and the assigned Amazon S3
     * storage location for a specific build. Valid credentials are required to
     * upload your game build files to Amazon S3.
     * </p>
     * <important>
     * <p>
     * Call this action only if you need credentials for a build created with
     * <code><a>CreateBuild</a></code>. This is a rare situation; in most cases,
     * builds are created using the CLI command <code>upload-build</code>, which
     * creates a build record and also uploads build files.
     * </p>
     * </important>
     * <p>
     * Upload credentials are returned when you create the build, but they have
     * a limited lifespan. You can get fresh credentials and use them to
     * re-upload game files until the state of that build changes to
     * <code>READY</code>. Once this happens, you must create a brand new build.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.RequestUploadCredentials
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(
            RequestUploadCredentialsRequest requestUploadCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<RequestUploadCredentialsRequest, RequestUploadCredentialsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ResolveAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ResolveAlias
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(
            ResolveAliasRequest resolveAliasRequest);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ResolveAlias
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(
            ResolveAliasRequest resolveAliasRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveAliasRequest, ResolveAliasResult> asyncHandler);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias
     * ID to be updated and provide the information to be changed. To reassign
     * an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.UpdateAlias
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(
            UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias
     * ID to be updated and provide the information to be changed. To reassign
     * an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateAlias
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(
            UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version.
     * To update the metadata, specify the build ID to update and provide the
     * new values. If successful, a build object containing the updated metadata
     * is returned.
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.UpdateBuild
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(
            UpdateBuildRequest updateBuildRequest);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version.
     * To update the metadata, specify the build ID to update and provide the
     * new values. If successful, a build object containing the updated metadata
     * is returned.
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateBuild
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(
            UpdateBuildRequest updateBuildRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBuildRequest, UpdateBuildResult> asyncHandler);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To
     * update metadata, specify the fleet ID and the property values you want to
     * change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateFleetAttributes
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetAttributes
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(
            UpdateFleetAttributesRequest updateFleetAttributesRequest);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To
     * update metadata, specify the fleet ID and the property values you want to
     * change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetAttributes
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetAttributes
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(
            UpdateFleetAttributesRequest updateFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetAttributesRequest, UpdateFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the
     * number of EC2 instances (hosts) that you want this fleet to contain.
     * Before calling this action, you may want to call
     * <a>DescribeEC2InstanceLimits</a> to get the maximum capacity based on the
     * fleet's EC2 instance type.
     * </p>
     * <p>
     * If you're using autoscaling (see <a>PutScalingPolicy</a>), you may want
     * to specify a minimum and/or maximum capacity. If you don't provide these,
     * autoscaling can set capacity anywhere between zero and the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >service limits</a>.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the number of
     * instances you want the fleet to host. If successful, Amazon GameLift
     * starts or terminates instances so that the fleet's active instance count
     * matches the desired instance count. You can view a fleet's current
     * capacity information by calling <a>DescribeFleetCapacity</a>. If the
     * desired instance count is higher than the instance type's limit, the
     * "Limit Exceeded" exception occurs.
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetCapacity
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(
            UpdateFleetCapacityRequest updateFleetCapacityRequest);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the
     * number of EC2 instances (hosts) that you want this fleet to contain.
     * Before calling this action, you may want to call
     * <a>DescribeEC2InstanceLimits</a> to get the maximum capacity based on the
     * fleet's EC2 instance type.
     * </p>
     * <p>
     * If you're using autoscaling (see <a>PutScalingPolicy</a>), you may want
     * to specify a minimum and/or maximum capacity. If you don't provide these,
     * autoscaling can set capacity anywhere between zero and the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >service limits</a>.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the number of
     * instances you want the fleet to host. If successful, Amazon GameLift
     * starts or terminates instances so that the fleet's active instance count
     * matches the desired instance count. You can view a fleet's current
     * capacity information by calling <a>DescribeFleetCapacity</a>. If the
     * desired instance count is higher than the instance type's limit, the
     * "Limit Exceeded" exception occurs.
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetCapacity
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(
            UpdateFleetCapacityRequest updateFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetCapacityRequest, UpdateFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet
     * ID to be updated and list the permissions you want to update. List the
     * permissions you want to add in
     * <code>InboundPermissionAuthorizations</code>, and permissions you want to
     * remove in <code>InboundPermissionRevocations</code>. Permissions to be
     * removed must match existing fleet permissions. If successful, the fleet
     * ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetPortSettings
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(
            UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet
     * ID to be updated and list the permissions you want to update. List the
     * permissions you want to add in
     * <code>InboundPermissionAuthorizations</code>, and permissions you want to
     * remove in <code>InboundPermissionRevocations</code>. Permissions to be
     * removed must match existing fleet permissions. If successful, the fleet
     * ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetPortSettings
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(
            UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetPortSettingsRequest, UpdateFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum
     * player count, protection policy, which controls whether or not an active
     * game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can
     * join the session. To update a game session, specify the game session ID
     * and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameSession
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(
            UpdateGameSessionRequest updateGameSessionRequest);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum
     * player count, protection policy, which controls whether or not an active
     * game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can
     * join the session. To update a game session, specify the game session ID
     * and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameSession
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(
            UpdateGameSessionRequest updateGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameSessionRequest, UpdateGameSessionResult> asyncHandler);

    /**
     * <p>
     * Updates the current runtime configuration for the specified fleet, which
     * tells GameLift how to launch server processes on instances in the fleet.
     * You can update a fleet's runtime configuration at any time after the
     * fleet is created; it does not need to be in an <code>ACTIVE</code> state.
     * </p>
     * <p>
     * To update runtime configuration, specify the fleet ID and provide a
     * <code>RuntimeConfiguration</code> object with the updated collection of
     * server process configurations.
     * </p>
     * <p>
     * Each instance in a GameLift fleet checks regularly for an updated runtime
     * configuration and changes how it launches server processes to comply with
     * the latest version. Existing server processes are not affected by the
     * update; they continue to run until they end, while GameLift simply adds
     * new server processes to fit the current runtime configuration. As a
     * result, the runtime configuration changes are applied gradually as
     * existing processes shut down and new processes are launched in GameLift's
     * normal process recycling activity.
     * </p>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         UpdateRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateRuntimeConfiguration
     */
    java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(
            UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest);

    /**
     * <p>
     * Updates the current runtime configuration for the specified fleet, which
     * tells GameLift how to launch server processes on instances in the fleet.
     * You can update a fleet's runtime configuration at any time after the
     * fleet is created; it does not need to be in an <code>ACTIVE</code> state.
     * </p>
     * <p>
     * To update runtime configuration, specify the fleet ID and provide a
     * <code>RuntimeConfiguration</code> object with the updated collection of
     * server process configurations.
     * </p>
     * <p>
     * Each instance in a GameLift fleet checks regularly for an updated runtime
     * configuration and changes how it launches server processes to comply with
     * the latest version. Existing server processes are not affected by the
     * update; they continue to run until they end, while GameLift simply adds
     * new server processes to fit the current runtime configuration. As a
     * result, the runtime configuration changes are applied gradually as
     * existing processes shut down and new processes are launched in GameLift's
     * normal process recycling activity.
     * </p>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateRuntimeConfiguration
     */
    java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(
            UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuntimeConfigurationRequest, UpdateRuntimeConfigurationResult> asyncHandler);

}
